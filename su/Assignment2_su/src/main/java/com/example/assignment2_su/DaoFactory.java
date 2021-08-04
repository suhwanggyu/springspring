package com.example.assignment2_su;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import javax.sql.DataSource;

@Configuration
@EnableConfigurationProperties
public class DaoFactory {

//    @Value("${spring.datasource.driver-class-name}")
//    private String data;

    @Value("${spring.datasource.url}")
    private String url;

    @Value("${spring.datasource.name}")
    private String name;

    @Value("${spring.datasource.username}")
    private String username;

    @Value("${spring.datasource.password}")
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

    @Bean
    public PizzaDao pizzaDao() {
        PizzaDao pizzaDao = new PizzaDao();
        pizzaDao.setDataSource(dataSource());
        return pizzaDao;
    }
}
