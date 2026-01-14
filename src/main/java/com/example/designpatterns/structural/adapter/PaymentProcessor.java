package com.example.designpatterns.structural.adapter;

/**
 * Target interface the application expects.
 */
public interface PaymentProcessor {
    void pay(double amountUsd);
}
