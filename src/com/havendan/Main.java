package com.havendan;

import com.havendan.creational.factory.Payment;
import com.havendan.creational.factory.PaymentFactory;
import com.havendan.creational.factory.TypePayment;

public class Main {
    public static void main(String[] args) {
        testFactoryMethod();
    }

    private static void testFactoryMethod(){
        try {
            Payment payment = PaymentFactory.buildPayment(TypePayment.CARD_PAYMENT);
            payment.doPayment();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}