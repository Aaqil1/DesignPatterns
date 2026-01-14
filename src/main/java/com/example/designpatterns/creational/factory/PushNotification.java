package com.example.designpatterns.creational.factory;

public class PushNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Mobile Push -> " + message);
    }
}

