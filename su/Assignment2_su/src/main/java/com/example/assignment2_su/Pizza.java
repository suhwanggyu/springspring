package com.example.assignment2_su;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
//@ConfigurationProperties(prefix = "spring.datasource")
public class Pizza {

    private int OrderNumber;
    private int pizzaNumber;
    private int orderQuantity;
    private String orderStatus;

    public Pizza(int orderNumber, int pizzaNumber, int orderQuantity, String orderStatus) {
        OrderNumber = orderNumber;
        this.pizzaNumber = pizzaNumber;
        this.orderQuantity = orderQuantity;
        this.orderStatus = orderStatus;
    }

    public Pizza() {

    }
}
