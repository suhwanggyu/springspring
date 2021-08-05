package com.example.assignment2_su;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.SQLException;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest()
//@ActiveProfiles("local")
@EnableConfigurationProperties
public class PizzaDaoTest {

    private AnnotationConfigApplicationContext ac;
    private PizzaDao pizzaDao;

    @Before
    public void before() {
        ac = new AnnotationConfigApplicationContext(DaoFactory.class);
        pizzaDao = ac.getBean(PizzaDao.class);
    }

    @Test
    public void add_addPizzaOrder_CheckInsertThis() throws SQLException {
        Pizza pizza1 = ac.getBean(Pizza.class);
        pizza1.setPizzaNumber(1);
        pizza1.setOrderQuantity(2);
        pizza1.setOrderStatus("주문완료");

        pizzaDao.insert(pizza1);

        ac.close();

    }

    @Test
    public void select_SelectAll_ReturnOrderList() throws SQLException {
        List<Pizza> list = pizzaDao.select();

        for (Pizza pizza : list) {
            assertThat(pizza.getOrderStatus()).isEqualTo("주문접수");
        }
    }

    @Test
    public void delete_WhenOrderDeleteByUsingOrderNumber_DeleteThat() {
        pizzaDao.delete(1);

    }

    @Test
    @Scheduled(fixedDelay = 3000)
    public void test_ThreeSecondSleep_WakeUpAfterThreeSecond() {
        System.out.println("Ta-da!");
    }

    @Test
    @Scheduled(cron = "*/5 * * * * *")
    public void test_RunEveryFiveSeconds_Print() {
        System.out.println("Ta-da!");
    }






    /*

    @Test
    public void get_CompareToOrderNumber_SameOrder() {
        Pizza firstOrderPizza = pizzaDao.get(1);

        assertThat(firstOrderPizza).isSameAs(pizza1);
    }


    @Test
    public void add_InsertOrder_ThereIsTheOrderInTable() {
        pizzaDao.add(pizza1);

        Pizza checkPizza1 = pizzaDao.get(pizza1.getOrderNumber());
        assertThat(checkPizza1.getPizzaNumber()).isEqualTo(pizza1.getPizzaNumber());
    }

    @Test
    public void getAll_CheckAllOrder_CheckSameOrders(){
        List<Pizza> pizzas0 = pizzaDao.getAll();
        assertThat(pizzas0.size()).isEqualTo(0);

        pizzaDao.add(pizza1);
        List<Pizza> pizzas1 = pizzaDao.getAll();
        assertThat(pizzas1.size()).isEqualTo(1);
    }

     */


}
