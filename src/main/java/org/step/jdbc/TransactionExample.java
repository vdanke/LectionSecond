package org.step.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Savepoint;

public class TransactionExample {

    public static void main(String[] args) {
        DatabaseManager databaseManager = new DatabaseManager();

        try {
            Class.forName(databaseManager.getValue(DatabaseConfigSupplier.DB_DRIVER));
            Connection connection = DriverManager.getConnection(
                    databaseManager.getValue(DatabaseConfigSupplier.DB_URL),
                    databaseManager.getValue(DatabaseConfigSupplier.DB_USERNAME),
                    databaseManager.getValue(DatabaseConfigSupplier.DB_PASSWORD)
            );
            connection.setAutoCommit(false);

            PreparedStatement insert = connection
                    .prepareStatement("INSERT INTO USERS(id, username, password) values(?, ?, ?)");
            insert.setLong(1, 6L);
            insert.setString(2, "newUser");
            insert.setString(3, "password");

            int insertSuccess = insert.executeUpdate();
            if (insertSuccess == -1) {
                connection.rollback();
            }
            Savepoint newUser = connection.setSavepoint("newUser");

            PreparedStatement update = connection
                    .prepareStatement("UPDATE USERS SET username = ?, password = ? WHERE id = ?");
            update.setString(1, "newUsername");
            update.setString(2, "newPassword");
            update.setLong(3, 6L);

            int updateSuccess = update.executeUpdate();
            if (updateSuccess != -1) {
                connection.commit();
            } else {
                connection.rollback(newUser);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
