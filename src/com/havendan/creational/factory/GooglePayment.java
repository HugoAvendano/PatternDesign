package com.havendan.creational.factory;

public class GooglePayment implements Payment {
    @Override
    public void doPayment() {
        System.out.println("Google Payment...");
    }
}
