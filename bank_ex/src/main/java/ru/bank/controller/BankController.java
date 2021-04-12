package ru.bank.controller;

import org.springframework.web.bind.annotation.*;
import ru.bank.entity.Client;
import ru.bank.service.ClientService;

import java.math.BigDecimal;
import java.sql.SQLException;

@RestController
public class BankController {

    private final ClientService clientService;

    public BankController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/balance/{clientId}")
    public int getBalance(@RequestParam("clientId") BigDecimal clientId) throws SQLException, ClassNotFoundException {
        return 533;
    }

    @PostMapping("/client")
    public void createClient(@RequestBody Client client) {
        clientService.createClient(client);
    }

    @PostMapping("/transfer/from/{from}/to/{to}/summa/{summa}")
    public void transferMoney(BigDecimal from, BigDecimal to, double summa) {
        clientService.transferMoney(from, to, summa);
    }
}
