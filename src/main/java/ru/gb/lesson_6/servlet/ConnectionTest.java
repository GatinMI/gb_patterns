package ru.gb.lesson_6.servlet;

import java.sql.*;

public class ConnectionTest {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/example", "example", "example");
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT 1;");
        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();
        System.out.println(resultSet.getInt(1));

    }
}
