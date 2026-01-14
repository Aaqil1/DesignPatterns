package com.example.designpatterns.structural.bridge;

/**
 * Implementor defines platform-specific sending logic.
 */
public interface MessageSender {
    void send(String subject, String body);
}
