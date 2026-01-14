package com.example.designpatterns.behavioral.observer;

public class RiskEngine implements Observer {
    @Override
    public void update(String stock, double price) {
        if (price < 50) {
            System.out.println("[Risk] Flagging cheap stock: " + stock);
        }
    }
}
