package com.example.designpatterns.structural.decorator;

/**
 * Adds audit logging around sending.
 */
public class AuditingSender extends MessageSenderDecorator {

    public AuditingSender(MessageSender delegate) {
        super(delegate);
    }

    @Override
    public void send(String message) {
        System.out.println("[audit] Sending message...");
        delegate.send(message);
        System.out.println("[audit] Message sent");
    }
}
