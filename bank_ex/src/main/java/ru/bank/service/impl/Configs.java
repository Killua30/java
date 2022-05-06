package ru.bank.service.impl;

import java.io.IOException;
import java.sql.*;

public class Configs {

    public static final String USER_NAME = "root";
    public static final String PASSWORD = "root";
    public static final String URL = "jdbc:mysql://localhost:3306/mysql";
    public static Connection connection;
    public static Statement statement;

    static {
        try {
            connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
            System.out.println("Соединение с СУБД выполнено.");
            statement = connection.createStatement();
            //resultSet = statement.executeQuery(query);
        } catch (SQLDataException throwables) {
            throwables.printStackTrace();
            throw new RuntimeException();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            //close connection ,stmt and resultset here
            try { connection.close(); } catch(SQLException se) { /*can't do anything */ }
            try { statement.close(); } catch(SQLException se) { /*can't do anything */ }

        }
    }

    public static void main (String Args) throws ClassNotFoundException, SQLException, IOException {

        Class.forName("com.mysql.cj.jdbc.client_base");

        ResultSet resultSet = statement.executeQuery("SELECT * FROM client_service");
        /*
        вывод полученных данных
        while(resultSet.next()){
            System.out.println(resultSet.getString(1) + " " +
                    resultSet.getString(2) + " " +
                    resultSet.getString(3) + " " +
                    resultSet.getString(4) + " "));
            }
         */


    }
}
