package ru.bank.service.impl;

import org.springframework.stereotype.Service;
import ru.bank.entity.Client;
import ru.bank.service.ClientService;

import java.math.BigDecimal;
import java.sql.*;

@Service
public class ClientServiceImpl implements ClientService {

    public int getBalance(int clientId) throws ClassNotFoundException, SQLException {
    return clientId;
    }

    public void createClient(Client client) {
    }

    public void transferMoney(BigDecimal from, BigDecimal to, double summa) {
    }
}