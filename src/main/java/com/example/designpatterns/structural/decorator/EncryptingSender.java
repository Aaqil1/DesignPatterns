package com.example.designpatterns.structural.decorator;

/**
 * Adds a simple (placeholder) encryption concern without changing the core sender.
 */
public class EncryptingSender extends MessageSenderDecorator {

    public EncryptingSender(MessageSender delegate) {
        super(delegate);
    }

    @Override
    public void send(String message) {
        String encrypted = new StringBuilder(message).reverse().toString();
        System.out.println("[encrypt] applying reversible cipher");
        delegate.send(encrypted);
    }
}
