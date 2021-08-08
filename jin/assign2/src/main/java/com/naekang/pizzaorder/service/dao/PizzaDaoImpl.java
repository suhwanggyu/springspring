package com.naekang.pizzaorder.service.dao;

import com.naekang.pizzaorder.service.Pizza;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component
public class PizzaDaoImpl implements PizzaDao {

    private JdbcTemplate jdbcTemplate;

    @Override
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate();
        this.jdbcTemplate.setDataSource(dataSource);
    }

    private final RowMapper<Pizza> pizzaMapper = new RowMapper<Pizza>() {
        @Override
        public Pizza mapRow(ResultSet rs, int rowNum) throws SQLException {
            Pizza pizza = new Pizza();
            pizza.setOrderId(rs.getInt("order_id"));
            pizza.setOrderMenu(rs.getString("order_menu"));
            pizza.setOrderQuantity(rs.getInt("order_quantity"));
            pizza.setOrderStatus(rs.getString("order_status"));

            return pizza;
        }
    };

    @Override
    public void insert(final Pizza pizza) throws SQLException {

        this.jdbcTemplate.update("INSERT INTO pizza(order_id, order_menu, order_quantity, order_status) values (?, ?, ?, ?)",
                pizza.getOrderId(),
                pizza.getOrderMenu(),
                pizza.getOrderQuantity(),
                pizza.getOrderStatus());

    }

    @Override
    public List<Pizza> selectAll() {

        return this.jdbcTemplate.query("SELECT * FROM pizza ORDER BY order_id", this.pizzaMapper);

    }

    @Override
    public Pizza select(int orderId) throws SQLException {

        return this.jdbcTemplate.queryForObject("SELECT * FROM pizza WHERE order_id = ?", new Object[]{orderId}, this.pizzaMapper);

    }

    @Override
    public void deleteAll() {

        this.jdbcTemplate.update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
                return con.prepareStatement("DELETE FROM pizza");
            }
        });
    }

    public int getCount() throws SQLException {

        return this.jdbcTemplate.queryForObject("SELECT COUNT(*) FROM pizza", Integer.class);
    }
}
