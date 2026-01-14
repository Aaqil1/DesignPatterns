package com.example.designpatterns.behavioral.observer;

import java.util.HashSet;
import java.util.Set;

/**
 * Concrete subject publishing stock price updates.
 */
public class StockMarket implements Subject {
    private final Set<Observer> observers = new HashSet<>();

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String stock, double price) {
        observers.forEach(o -> o.update(stock, price));
    }

    public void updatePrice(String stock, double price) {
        System.out.println("Market update: " + stock + " -> " + price);
        notifyObservers(stock, price);
    }
}
