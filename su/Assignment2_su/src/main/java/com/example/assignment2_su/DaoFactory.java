package com.example.assignment2_su;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import javax.sql.DataSource;

@Configuration
public class DaoFactory {

//    @Value(url)
//    이걸 읽어서 이 해당하는 변수값들을 url, password 이런식으로
//    @ConfigurationProperties


    @Bean
    public DataSource dataSource() {
        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();

//        dataSource.setDriverClass(com.mysql.cj.jdbc.Driver.class);
//        dataSource.setUrl("jdbc:mysql://localhost:1234/local_db");
//        dataSource.setUsername("root");
//        dataSource.setPassword("6203");

        return dataSource;
    }

    @Bean
    public PizzaDao pizzaDao() {
        PizzaDao pizzaDao = new PizzaDao();
        pizzaDao.setDataSource(dataSource());
        return pizzaDao;
    }
}
