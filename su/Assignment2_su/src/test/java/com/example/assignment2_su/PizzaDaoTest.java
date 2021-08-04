package com.example.assignment2_su;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest()
@ActiveProfiles("local")
@EnableConfigurationProperties
public class PizzaDaoTest {
    private PizzaDao pizzaDao;
    private Pizza pizza;

    @Before
    public void before() {
        this.pizzaDao = new PizzaDao();
    }

    @Before
    public void add_PushNewOrder_ThereIsTheOrderInRepository() {

    }
}
