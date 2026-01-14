package com.example.designpatterns.structural.bridge;

public class SlackSender implements MessageSender {
    @Override
    public void send(String subject, String body) {
        System.out.println("Slack => " + subject + " | " + body);
    }
}
