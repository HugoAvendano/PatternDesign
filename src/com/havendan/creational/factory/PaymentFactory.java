package com.havendan.creational.factory;

public class PaymentFactory {
    public static Payment buildPayment(TypePayment typePayment) throws Exception{
        switch (typePayment){
            case CARD_PAYMENT:
                return new CardPayment();
            case GOOGLE_PAYMENT:
                return new GooglePayment();
            default:
                throw  new Exception("non-existent form of payment");
        }
    }
}
