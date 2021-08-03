package com.example.assignment2_su;

public class Pizza {
    private String orderNumber;
    private String orderQuantity;
    private String orderStatus;

    public Pizza(String orderNumber, String orderQuantity, String orderStatus) {
        this.orderNumber = orderNumber;
        this.orderQuantity = orderQuantity;
        this.orderStatus = orderStatus;
    }

    public Pizza() {

    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(String orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
}
