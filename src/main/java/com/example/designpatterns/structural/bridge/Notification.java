package com.example.designpatterns.structural.bridge;

/**
 * Abstraction that delegates sending to a MessageSender implementor.
 */
public abstract class Notification {
    protected final MessageSender sender;

    protected Notification(MessageSender sender) {
        this.sender = sender;
    }

    public abstract void notifyUser(String message);
}
