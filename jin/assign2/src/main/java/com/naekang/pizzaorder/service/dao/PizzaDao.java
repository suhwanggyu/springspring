package com.naekang.pizzaorder.service.dao;

import com.naekang.pizzaorder.service.Pizza;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

public interface PizzaDao {

    public void setDataSource(DataSource dataSource);

    public void insert(final Pizza pizza) throws SQLException;

    public List<Pizza> selectAll();

    public Pizza select(int orderId) throws SQLException;

    public void deleteAll();

    public int getCount() throws SQLException;
}
