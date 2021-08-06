package com.example.assignment2_su;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.BufferedReader;
import java.io.InputStreamReader;

@SpringBootApplication
public class Assignment2SuApplication {
    private static AnnotationConfigApplicationContext ac;
    private static PizzaDao pizzaDao;
    private static Pizza pizza;

    public static void main(String[] args) throws Exception {
        ac = new AnnotationConfigApplicationContext(DaoFactory.class);
        pizzaDao = ac.getBean(PizzaDao.class);
        pizza = new Pizza();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int exit1 = 0;
        while (true) {
            System.out.println("번호를 선택하시오.");
            System.out.println("1. 주문하기 \n2. 주문 조회 하기 ");

            int x = Integer.parseInt(br.readLine());
            int exit = 0;

            if (x == 1) {
                exit1 = -1;
                while (true) {
                    System.out.println("선택하실 피자 번호를 입력하시오.");
                    System.out.println("1. 페퍼로니 피자\n2. 하와이안 피자\n3. 불고기 피자\n4. 치즈피자");
                    int pizzaNum = Integer.parseInt(br.readLine());

                    System.out.println("피자의 수량을 입력하시오");
                    int quantity = Integer.parseInt(br.readLine());

                    switch (pizzaNum) {
                        case (1):
                            pizza.setPizzaNumber(1);
                            pizza.setOrderStatus("주문접수");
                            pizza.setOrderQuantity(quantity);
                            pizzaDao.insert(pizza);
                            exit = -1;
                            break;

                        case (2):
                            pizza.setPizzaNumber(2);
                            pizza.setOrderStatus("주문접수");
                            pizza.setOrderQuantity(quantity);
                            pizzaDao.insert(pizza);
                            exit = -1;

                            break;

                        case (3):
                            pizza.setPizzaNumber(3);
                            pizza.setOrderStatus("주문접수");
                            pizza.setOrderQuantity(quantity);
                            pizzaDao.insert(pizza);
                            exit = -1;

                            break;

                        case (4):
                            pizza.setPizzaNumber(4);
                            pizza.setOrderStatus("주문접수");
                            pizza.setOrderQuantity(quantity);
                            pizzaDao.insert(pizza);
                            exit = -1;
                            break;

                        default:
                            System.out.println("메뉴에 있는 피자의 숫자만 입력해주세요 :)");
                            break;
                    }
                    if (exit == -1) {
                        break;
                    }
                }
                Pizza pizza2 = pizzaDao.selectLastValue();
                System.out.println("당신의 주문번호는 " + pizza2.getOrderNumber() +" 입니다.");

            } else if (x == 2) {
                exit1 = -1;
                System.out.println("주문 번호를 입력하시오.");
                int num = Integer.parseInt(br.readLine());
                Pizza pizza = pizzaDao.select(num);
                System.out.println("==================");
                System.out.println("OrderNumber = " + pizza.getOrderNumber());
                System.out.println("PizzaNumber = " + pizza.getPizzaNumber());
                System.out.println("OrderQuantity = " + pizza.getOrderQuantity());
                System.out.println("OrderStatus = " + pizza.getOrderStatus());
                System.out.println("==================");

            } else {
                System.out.println("1과 2중에 선택하시오");
            }
            if (exit1 == -1) {
                break;
            }
        }
        SpringApplication.run(Assignment2SuApplication.class, args);
    }
}

