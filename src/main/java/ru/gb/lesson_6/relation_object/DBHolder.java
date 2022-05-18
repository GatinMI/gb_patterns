package ru.gb.lesson_6.relation_object;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHolder {
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:postgresql://localhost:5432/example", "example", "example");
    }
}
