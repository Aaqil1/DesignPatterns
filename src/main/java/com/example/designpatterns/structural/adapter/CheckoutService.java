package com.example.designpatterns.structural.adapter;

/**
 * Client code depends only on the target interface.
 */
public class CheckoutService {
    private final PaymentProcessor processor;

    public CheckoutService(PaymentProcessor processor) {
        this.processor = processor;
    }

    public void charge(double amountUsd) {
        processor.pay(amountUsd);
    }
}
