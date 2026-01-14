package com.example.designpatterns.behavioral.strategy;

/**
 * Problem: Pricing rules change based on campaigns and inventory. Hard-coding
 * if (sale) branches scattered across checkout made changes risky.
 *
 * Strategy encapsulates pricing policies and lets checkout swap them.
 */
public class Main {
    public static void main(String[] args) {
        CheckoutService checkout = new CheckoutService(new RegularPricing());
        System.out.println("Regular: " + checkout.price(100));

        checkout.setStrategy(new DiscountPricing(0.20));
        System.out.println("Black Friday: " + checkout.price(100));

        checkout.setStrategy(new SurgePricing(1.5));
        System.out.println("Low stock surge: " + checkout.price(100));
    }
}
