package com.example.designpatterns.structural.bridge;

public class EmailSender implements MessageSender {
    @Override
    public void send(String subject, String body) {
        System.out.println("Email => " + subject + " | " + body);
    }
}
