package com.example.designpatterns.structural.facade;

class EmailService {
    void sendWelcome(String name) {
        System.out.println("Welcome email sent to " + name);
    }
}
