package com.example.designpatterns.structural.decorator;

public class BasicSender implements MessageSender {
    @Override
    public void send(String message) {
        System.out.println("Sending plain message: " + message);
    }
}
