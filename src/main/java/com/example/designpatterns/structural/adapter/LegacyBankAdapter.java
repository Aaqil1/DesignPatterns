package com.example.designpatterns.structural.adapter;

/**
 * Adapter converts the application's expected interface to the legacy API.
 */
public class LegacyBankAdapter implements PaymentProcessor {
    private final LegacyBankApi bankApi;
    private final String customerCode;

    public LegacyBankAdapter(LegacyBankApi bankApi, String customerCode) {
        this.bankApi = bankApi;
        this.customerCode = customerCode;
    }

    @Override
    public void pay(double amountUsd) {
        int cents = (int) Math.round(amountUsd * 100);
        bankApi.transferCents(cents, customerCode);
    }
}
