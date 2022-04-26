package ru.gb.lesson_2.solid.single_responsibility;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository {
    private JdbcTemplate jdbcTemplate;
    public void save(){
        jdbcTemplate.execute("INSERT *");
    }
    public void load(){
        jdbcTemplate.execute("INSERT *");
    }
}
