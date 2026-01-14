package com.example.designpatterns.behavioral.observer;

/**
 * Problem: Multiple systems (mobile app, risk engine) need stock price updates
 * in real time. Polling or direct coupling caused stale data and tight links.
 *
 * Observer lets dependents subscribe and react automatically.
 */
public class Main {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();
        market.attach(new MobileApp());
        market.attach(new RiskEngine());

        market.updatePrice("ACME", 42.5);
        market.updatePrice("ZEN", 120.0);
    }
}
