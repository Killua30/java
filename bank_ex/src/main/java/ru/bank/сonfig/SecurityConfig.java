package ru.bank.сonfig;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import ru.bank.entity.Client;
import ru.bank.entity.Role;
import ru.bank.rest.DeveloperRestControllerV1;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
    DeveloperRestControllerV1 Developer = new DeveloperRestControllerV1();

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers(HttpMethod.GET,"/api/v1/clients/p1").hasRole(Role.P1.name())
                .antMatchers(HttpMethod.GET,"/api/v1/clients/p2").hasRole(Role.P2.name())
                .antMatchers(HttpMethod.GET,"/api/v1/clients/p3").hasRole(Role.P3.name())
                .antMatchers(HttpMethod.GET,"/api/v1/clients/p4").hasRole(Role.P4.name())
                .antMatchers(HttpMethod.GET,"/api/v1/clients/p5").hasRole(Role.P5.name())
                .antMatchers(HttpMethod.GET,"/api/v1/clients/p6").hasRole(Role.P6.name())
                .antMatchers(HttpMethod.GET,"/api/v1/clients/p7").hasRole(Role.P7.name())
                .antMatchers(HttpMethod.GET,"/api/v1/clients/p8").hasRole(Role.P8.name())
                .antMatchers(HttpMethod.GET,"/api/v1/clients/p9").hasRole(Role.P9.name())
                .antMatchers(HttpMethod.GET,"/api/v1/clients/p10").hasRole(Role.P10.name())
                .antMatchers(HttpMethod.GET,"/api/v1/clients").hasAnyRole(Role.P2.name(),Role.P6.name() )

                .anyRequest()
                .authenticated()
                .and()
               .httpBasic();




                /*
                .formLogin()
                .loginPage("/auth/login").permitAll()
                .defaultSuccessUrl("/auth/success")
                .and()
                .logout()
                .logoutRequestMatcher(new AntPathRequestMatcher("/auth/logout", "POST"))
                .invalidateHttpSession(true)
                .clearAuthentication(true)
                .deleteCookies("JSESSIONID")
                .logoutSuccessUrl("/auth/login");

                 */
    }
    @Bean
    @Override
    protected UserDetailsService userDetailsService() {
        InMemoryUserDetailsManager inMemoryUserDetailsManager= new InMemoryUserDetailsManager();
        for(Client client : Developer.CLIENTS){

            inMemoryUserDetailsManager.createUser(User.builder()

                    .username(client.getName())
                    .password(passwordEncoder().encode(client.getPassword()))
                    .roles("P"+ client.getId())
                    .build());

        }
        return inMemoryUserDetailsManager;


    }


    @Bean
    protected PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(12);
    }
}
