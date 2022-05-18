package ru.gb.lesson_6.relation_object;

import java.sql.*;
import java.util.Optional;

public class PersonMapperImpl implements PersonMapper {

    public PersonMapperImpl() {
    }

    @Override
    public Optional<Person> find(Long id) {
        System.out.println("execute request");
        try (Connection connection = DBHolder.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement("select id, name, job_id from person where id = ?");
            preparedStatement.setLong(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return Optional.of(new Person(resultSet.getLong(1), resultSet.getString(2), resultSet.getLong(3)));
            }
        } catch (SQLException ignored) {

        }
        return Optional.empty();
    }

    @Override
    public Long insert(Person object) {
        try (Connection connection = DBHolder.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO person(name, job_id) " +
                    "VALUES (?, ?) RETURNING *");
            preparedStatement.setString(1, object.getName());
            preparedStatement.setLong(2, object.getJobId());
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return resultSet.getLong("id");
            }
        } catch (SQLException ignored) {

        }
        return null;
    }

    @Override
    public boolean delete(Long id) {
        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/example", "example", "example")) {
            PreparedStatement preparedStatement = connection.prepareStatement("delete from person where id = ?");
            preparedStatement.setLong(1, id);
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException ignored) {

        }
        return false;
    }

    @Override
    public boolean update(Person object) {
        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/example", "example", "example")) {
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE person SET name = ?, job_id = ? where id = ?");
            preparedStatement.setString(1, object.getName());
            preparedStatement.setLong(2, object.getJobId());
            preparedStatement.setLong(3, object.getId());
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException ignored) {
            System.err.println(ignored);
        }
        return false;

    }

    @Override
    public Optional<Person> findByName(String name) {
        try (Connection connection = DBHolder.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement("select id, name, job_id from person where name = ?");
            preparedStatement.setString(1, name);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return Optional.of(new Person(resultSet.getLong(1), resultSet.getString(2), resultSet.getLong(3)));
            }
        } catch (SQLException ignored) {

        }
        return Optional.empty();
    }
}
