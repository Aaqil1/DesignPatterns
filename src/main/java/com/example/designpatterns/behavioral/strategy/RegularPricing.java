package com.example.designpatterns.behavioral.strategy;

/**
 * Strategy for normal retail pricing.
 */
public class RegularPricing implements PricingStrategy {
    @Override
    public double calculate(double basePrice) {
        return basePrice;
    }
}
