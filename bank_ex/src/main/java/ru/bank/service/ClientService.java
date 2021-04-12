package ru.bank.service;

import ru.bank.entity.Client;

import java.math.BigDecimal;
import java.sql.SQLException;

public interface ClientService {



    int getBalance(int clientId) throws ClassNotFoundException, SQLException;

    void createClient(Client client);

    void transferMoney(BigDecimal from, BigDecimal to, double summa);

}
