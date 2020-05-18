package org.step.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class CallableStatementExample {

    public static void main(String[] args) {
        try {
            Class.forName(DatabaseConfigSupplier.DB_DRIVER);
            Connection connection = DriverManager.getConnection(
                    DatabaseConfigSupplier.DB_URL,
                    DatabaseConfigSupplier.DB_USERNAME,
                    DatabaseConfigSupplier.DB_PASSWORD
            );
            CallableStatement callableStatement = connection.prepareCall("{call calcusers(?)}");

            callableStatement.registerOutParameter(1, Types.INTEGER);
            callableStatement.setString(1, "user");

            callableStatement.execute();

            int countUsers = callableStatement.getInt(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
