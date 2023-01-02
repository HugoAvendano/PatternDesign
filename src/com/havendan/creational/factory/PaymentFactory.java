package com.havendan.creational.factory;

public class PaymentFactory {
    public static Payment buildPayment(TypePayment typePayment) throws Exception{
        return switch (typePayment) {
            case CARD_PAYMENT -> new CardPayment();
            case GOOGLE_PAYMENT -> new GooglePayment();
            default -> throw new Exception("non-existent form of payment");
        };
    }
}
