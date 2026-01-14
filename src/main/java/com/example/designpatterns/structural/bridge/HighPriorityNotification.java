package com.example.designpatterns.structural.bridge;

/**
 * Refined abstraction for urgent notifications.
 */
public class HighPriorityNotification extends Notification {

    public HighPriorityNotification(MessageSender sender) {
        super(sender);
    }

    @Override
    public void notifyUser(String message) {
        sender.send("URGENT", "! " + message);
    }
}
