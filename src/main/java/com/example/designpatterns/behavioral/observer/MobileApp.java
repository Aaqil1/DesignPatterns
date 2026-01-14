package com.example.designpatterns.behavioral.observer;

public class MobileApp implements Observer {
    @Override
    public void update(String stock, double price) {
        System.out.println("[Mobile] " + stock + " now at " + price);
    }
}
