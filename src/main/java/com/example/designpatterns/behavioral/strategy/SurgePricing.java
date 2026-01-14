package com.example.designpatterns.behavioral.strategy;

/**
 * Strategy for surge pricing (e.g., limited inventory).
 */
public class SurgePricing implements PricingStrategy {
    private final double multiplier;

    public SurgePricing(double multiplier) {
        this.multiplier = multiplier;
    }

    @Override
    public double calculate(double basePrice) {
        return basePrice * multiplier;
    }
}
