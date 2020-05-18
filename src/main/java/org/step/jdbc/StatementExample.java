package org.step.jdbc;

import java.sql.*;

public class StatementExample {

    public static void main(String[] args) {
        DatabaseManager databaseManager = new DatabaseManager();

        try {
            // Загрузили драйвер для нашей базы данных
            Class.forName(databaseManager.getValue(DatabaseConfigSupplier.DB_DRIVER));
            // Создали соединение с базой данных
            Connection connection = DriverManager.getConnection(
                    databaseManager.getValue(DatabaseConfigSupplier.DB_URL),
                    databaseManager.getValue(DatabaseConfigSupplier.DB_USERNAME),
                    databaseManager.getValue(DatabaseConfigSupplier.DB_PASSWORD)
            );
            // Создали запрос
            Statement statement = connection.createStatement(
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
//            PreparedStatement preparedStatement = connection
//                    .prepareStatement("INSERT INTO USERS(id, username, password) values(?, ? ,?)");
//            preparedStatement.setLong(1, 2L);
//            preparedStatement.setString(2, "admin");
//            preparedStatement.setString(3, "admin");

//            int executeUpdate = preparedStatement.executeUpdate();

//            System.out.println(executeUpdate);

            // Получили результат этого запроса
            statement.addBatch("INSERT INTO USERS(id, username, password) values (3, \"First\",\"First\")");
            statement.addBatch("INSERT INTO USERS(id, username, password) values (4, \"Second\",\"Second\")");
            statement.addBatch("INSERT INTO USERS(id, username, password) values (5, \"Third\",\"Third\")");

            int[] updateCounts = statement.executeBatch();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM USERS");

            // Выводим полученные данные
            while (resultSet.next()) {
                System.out.println(resultSet.getLong(1) + " " + resultSet.getString("username") +
                        " " + resultSet.getString(3));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
