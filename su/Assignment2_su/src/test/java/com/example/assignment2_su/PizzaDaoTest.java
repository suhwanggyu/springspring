package com.example.assignment2_su;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

@RunWith(SpringRunner.class)
@SpringBootTest()
@ActiveProfiles("local")
@EnableConfigurationProperties
public class PizzaDaoTest {
    @Autowired
    private PizzaDao pizzaDao;

    private Pizza pizza1;
    private Pizza pizza2;
    private Pizza pizza3;


    @Before
    public void before() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(DaoFactory.class);

        this.pizza1 = new Pizza(1, 1, 3, "주문접수");
        this.pizza2 = new Pizza(2, 3, 1, "주문완료");
    }

    @Test
    public void add_InsertOrder_ThereIsTheOrderInTable() {
        pizzaDao.add(pizza1);

        Pizza checkPizza1 = pizzaDao.get(pizza1.getOrderNumber());
        Assertions.assertThat(checkPizza1.getPizzaNumber()).isEqualTo(pizza1.getPizzaNumber());
    }

}
