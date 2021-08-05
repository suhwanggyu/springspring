package com.example.assignment2_su;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

@SpringBootApplication
public class Assignment2SuApplication {
    private static AnnotationConfigApplicationContext ac;
    private static PizzaDao pizzaDao;
    private static Pizza pizza;

    public static void main(String[] args) throws Exception {
        ac = new AnnotationConfigApplicationContext(DaoFactory.class);
        pizzaDao = ac.getBean(PizzaDao.class);
        pizza = ac.getBean(Pizza.class);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("번호를 선택하시오.");
        System.out.println("1. 주문하기 \n2. 주문 조회 하기 ");

        int x = Integer.parseInt(br.readLine());
        if (x == 1) {
            System.out.println("선택하실 피자 번호를 입력하세요.");
            System.out.println("1. 페퍼로니 피자\n2. 하와이안 피자\n3. 불고기 피자\n4. 치즈피자");

            int pizzaNum = Integer.parseInt(br.readLine());



            switch (pizzaNum) {
                case (1):
                    pizza.setPizzaNumber(1);
                    pizza.setOrderStatus("주문접수");
                    pizza.setOrderQuantity(2);
                    pizzaDao.insert(pizza);
                case (2):
                    pizza.setPizzaNumber(2);
                    pizza.setOrderStatus("주문접수");
                    pizza.setOrderQuantity(1);
                    pizzaDao.insert(pizza);
                case (3):
                    pizza.setPizzaNumber(3);
                    pizza.setOrderStatus("주문접수");
                    pizza.setOrderQuantity(3);
                    pizzaDao.insert(pizza);
                case (4):
                    pizza.setPizzaNumber(4);
                    pizza.setOrderStatus("주문접수");
                    pizza.setOrderQuantity(1);
                    pizzaDao.insert(pizza);

            }
        }

        if (x == 2) {
            List<Pizza> list = pizzaDao.select();
            for (Pizza pizza : list) {
                System.out.println("OrderNumber = " + pizza.getOrderNumber());
                System.out.println("PizzaNumber = " + pizza.getPizzaNumber());
                System.out.println("OrderQuantity = " + pizza.getOrderQuantity());
                System.out.println("OrderStatus = " + pizza.getOrderStatus());
                System.out.println("==================");
            }
        }
        SpringApplication.run(Assignment2SuApplication.class, args);


    }

}
