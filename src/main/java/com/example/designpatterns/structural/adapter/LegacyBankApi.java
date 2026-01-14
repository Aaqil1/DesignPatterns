package com.example.designpatterns.structural.adapter;

/**
 * Incompatible third-party API that works with cents and customer codes.
 */
public class LegacyBankApi {
    public void transferCents(int cents, String customerCode) {
        System.out.println("Legacy bank wired " + cents + " cents for customer " + customerCode);
    }
}
