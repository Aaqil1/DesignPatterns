package com.example.designpatterns.structural.bridge;

/**
 * Refined abstraction for routine notifications.
 */
public class LowPriorityNotification extends Notification {

    public LowPriorityNotification(MessageSender sender) {
        super(sender);
    }

    @Override
    public void notifyUser(String message) {
        sender.send("Info", message);
    }
}
