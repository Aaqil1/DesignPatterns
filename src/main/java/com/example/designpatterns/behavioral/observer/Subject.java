package com.example.designpatterns.behavioral.observer;

public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers(String stock, double price);
}
