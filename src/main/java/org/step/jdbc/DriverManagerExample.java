package org.step.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DriverManagerExample {

    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5433/social";
        String password = "postgres";
        String username = "postgres";

        Properties databaseProperties = new Properties();
        databaseProperties.put("username", username);
        databaseProperties.put("password", password);

        try {
            Class.forName("org.postgresql.Driver");
//            Connection connection = DriverManager.getConnection(url);
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Successfully connected");
//            DriverManager.getConnection(url, databaseProperties);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
