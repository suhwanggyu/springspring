package com.example.assignment2_su;

import java.io.DataOutputStream;

public enum OrderStatus {
    ReceivingOrder(0),
    MakingPizza(1),
    MiddleOfDelivery(2),
    Completed(3);

    private int v;
    private OrderStatus(int v) {
        this.v = v;
    }

    public int getV() {

        return v;
    }
}



