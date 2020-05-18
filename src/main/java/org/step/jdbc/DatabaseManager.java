package org.step.jdbc;

import java.util.ResourceBundle;

public class DatabaseManager {

    private ResourceBundle database = ResourceBundle.getBundle("db");

    public String getValue(String key) {
        return database.getString(key);
    }
}
