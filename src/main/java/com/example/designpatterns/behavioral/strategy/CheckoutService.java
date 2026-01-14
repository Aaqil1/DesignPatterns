package com.example.designpatterns.behavioral.strategy;

/**
 * Context that can swap pricing strategies at runtime.
 */
public class CheckoutService {
    private PricingStrategy strategy;

    public CheckoutService(PricingStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(PricingStrategy strategy) {
        this.strategy = strategy;
    }

    public double price(double basePrice) {
        return strategy.calculate(basePrice);
    }
}
