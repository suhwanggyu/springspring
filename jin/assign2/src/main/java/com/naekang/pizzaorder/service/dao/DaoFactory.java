package com.naekang.pizzaorder.service.dao;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import javax.sql.DataSource;

@Configuration
@EnableConfigurationProperties
public class DaoFactory {

    @Bean
    public PizzaDao pizzaDao() {

        PizzaDaoImpl pizzaDao = new PizzaDaoImpl();
        pizzaDao.setDataSource(dataSource());

        return pizzaDao;
    }

    @Bean
    public DataSource dataSource() {
        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();

        dataSource.setDriverClass(com.mysql.cj.jdbc.Driver.class);
        dataSource.setUrl("jdbc:mysql://localhost:3306/pizza?serverTimezone=Asia/Seoul&characterEncoding=UTF-8");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");

        return dataSource;
    }
}
