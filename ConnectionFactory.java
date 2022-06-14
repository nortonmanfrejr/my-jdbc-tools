package br.com.connectorDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public Connection getConnection(String user, String password){


        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/NOMEBASEDADO", user, password);
        } catch (SQLException Error){
            throw new RuntimeException(Error);
        }
    }
}
