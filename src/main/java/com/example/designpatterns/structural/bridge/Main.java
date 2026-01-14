package com.example.designpatterns.structural.bridge;

/**
 * Problem: We need to send notifications over multiple channels (email, Slack)
 * and also vary urgency (low vs high). Creating a class for every combination
 * leads to a class explosion.
 *
 * Bridge separates the abstraction (priority) from the implementation
 * (channel), letting us mix and match freely.
 */
public class Main {
    public static void main(String[] args) {
        Notification infoEmail = new LowPriorityNotification(new EmailSender());
        Notification criticalSlack = new HighPriorityNotification(new SlackSender());

        infoEmail.notifyUser("Daily digest ready");
        criticalSlack.notifyUser("Order processing is failing");
    }
}
