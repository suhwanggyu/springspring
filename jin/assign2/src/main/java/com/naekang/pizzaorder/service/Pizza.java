package com.naekang.pizzaorder.service;

import lombok.*;
import org.springframework.stereotype.Component;

@Data
@Getter
@Setter
@Component
public class Pizza {

    private int orderId;

    private String orderMenu;

    private int orderQuantity;

    private String orderStatus;

    public Pizza() { }

    public Pizza(int orderId, String orderMenu, int orderQuantity, String orderStatus) {
        this.orderId = orderId;
        this.orderMenu = orderMenu;
        this.orderQuantity = orderQuantity;
        this.orderStatus = orderStatus;
    }
}
