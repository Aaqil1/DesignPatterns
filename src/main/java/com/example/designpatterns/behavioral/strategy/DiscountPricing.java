package com.example.designpatterns.behavioral.strategy;

/**
 * Strategy applying a percentage promotion.
 */
public class DiscountPricing implements PricingStrategy {
    private final double percent;

    public DiscountPricing(double percent) {
        this.percent = percent;
    }

    @Override
    public double calculate(double basePrice) {
        return basePrice * (1 - percent);
    }
}
