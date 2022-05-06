import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;
        import org.springframework.boot.test.context.SpringBootTest;
import ru.bank.BankApplication;
import ru.bank.service.impl.ClientServiceImpl;
import ru.bank.entity.Client;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import ru.bank.rest.ClientRestControllerV1;
@SpringBootTest
public class Tests {
    @Test
    boolean getAllClients() {
//создаем тестовые данные
        Client client1 = new Client(1, "Ivan", "13356",25.3);
        Client client2 = new Client(2, "Marat", "223462",1000000.0);
        Client client3 = new Client(3, "Petya", "4436",1.5);

//создаем список expected и заполняем его данными нашего метода
        List<Client> expected = ClientRestControllerV1.getAllClients();

//создаем список actual в него помещаем данные для сравнения
//то что мы предпологиаем метод должен вернуть
        List<Client> actual = new ArrayList<>();
        actual.add(client1);
        actual.add(client2);
        actual.add(client3);

//запускаем тест, в случае если список expected и actual не будут равны
//тест будет провален, о результатах теста читаем в консоли
        return expected.equals(actual) ;
    }


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
}