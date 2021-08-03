package com.example.assignment2_su;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class PizzaDao {
    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
}
