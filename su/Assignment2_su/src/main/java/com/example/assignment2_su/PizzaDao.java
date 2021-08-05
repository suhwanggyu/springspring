package com.example.assignment2_su;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PizzaDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private MapperClass mapperClass;

    public void insert(Pizza pizza) {
        String sql = "INSERT INTO pizza_order (OrderNumber, pizzaNumber,orderQuantity,orderStatus) VALUES(?,?,?,?)";
        jdbcTemplate.update(sql
                ,pizza.getOrderNumber()
                , pizza.getPizzaNumber()
                , pizza.getOrderQuantity()
                , pizza.getOrderStatus());
    }

    public List<Pizza> select() {
        String sql = "SELECT * FROM pizza_order";
        List<Pizza> orderList = jdbcTemplate.query(sql, mapperClass);

        return orderList;
    }

    public void delete(int OrderNumber) {
        String sql = "delete from pizza_order where OrderNumber = ?";
        jdbcTemplate.update(sql, OrderNumber);
    }


}
