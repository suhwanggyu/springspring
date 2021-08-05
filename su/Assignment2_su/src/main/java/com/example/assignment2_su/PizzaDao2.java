/*
package com.example.assignment2_su;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

@Configuration
@Getter
@Setter
@ConfigurationProperties("spring.datasource")
public class PizzaDao2 {
    private String data;
    private String url;
    private String name;
    private String username;
    private String password;

    @Bean
    public DataSource dataSource() {
        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
        dataSource.setDriverClass(com.mysql.cj.jdbc.Driver.class);
        dataSource.setUrl(url+"/"+name);
        dataSource.setUsername(username);
        dataSource.setPassword(password);

        return dataSource;
    }

    public int addOrder2(Pizza pizza) {
        int insertCnt = 0;
        try {
            Class.forName(data);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String sql = "INSERT INTO pizza_order (OrderNumber, pizzaNumber,orderQuantity,orderStatus) VALUES(?,?,?,?)";

        try (Connection conn = DriverManager.getConnection(url + "/" + name, username, password);
            PreparedStatement ps = conn.prepareStatement(sql)) {

                ps.setInt(1, pizza.getOrderNumber());
                ps.setString(2, pizza.getOrderStatus());

                insertCnt = ps.executeUpdate();
            }catch (Exception ex) {
            ex.printStackTrace();
        }
        return insertCnt;

}

}

 */
