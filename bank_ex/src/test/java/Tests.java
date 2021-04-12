import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;
        import org.springframework.boot.test.context.SpringBootTest;
import ru.bank.service.impl.ClientServiceImpl;

import java.sql.SQLException;

@SpringBootTest
public class Tests {

    @Test
    boolean TEST1() throws SQLException, ClassNotFoundException {
        ClientServiceImpl clientService1 = new ClientServiceImpl();
        ClientServiceImpl clientService2 = new ClientServiceImpl();
        ClientServiceImpl clientService3 = new ClientServiceImpl();
        ClientServiceImpl clientService4 = new ClientServiceImpl();
        ClientServiceImpl clientService5 = new ClientServiceImpl();
        if (clientService1.getBalance(5) != clientService2.getBalance(5)) return false;
        if (clientService3.getBalance(7) != clientService4.getBalance(7)) return false;
        if (clientService1.getBalance(2) != clientService2.getBalance(2)) return false;
        if (clientService5.getBalance(1) != clientService4.getBalance(1)) return false;
        if (clientService2.getBalance(9) != clientService3.getBalance(9)) return false;
        return true;
    }

    @Test
    boolean TEST2() {
        int http = 0;
        for (; http < 10; http++) {
            http = (http + http) / 2;
        }
        int MEMORY = 10;
        if (http == 9) return true;
        else return false;
    }
}