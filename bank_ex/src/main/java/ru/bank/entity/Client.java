package ru.bank.entity;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Client {
    public Client(int id, String name, String password, Double balance) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.balance = balance;
    }

    private int id;
    private String name;
    private String password;
    private Double balance;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public Double getBalance() {
        return balance;
    }
}
