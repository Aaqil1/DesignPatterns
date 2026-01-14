package com.example.designpatterns.structural.adapter;

/**
 * Problem: Checkout uses a simple PaymentProcessor interface, but finance
 * signed a legacy bank API that only accepts cents and customer codes.
 *
 * Adapter lets us plug the new API without changing checkout code.
 */
public class Main {
    public static void main(String[] args) {
        LegacyBankApi bankApi = new LegacyBankApi();
        PaymentProcessor processor = new LegacyBankAdapter(bankApi, "CUST-42");

        CheckoutService checkout = new CheckoutService(processor);
        checkout.charge(19.99);
        checkout.charge(5.50);
    }
}
