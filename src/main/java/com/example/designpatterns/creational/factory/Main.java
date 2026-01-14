package com.example.designpatterns.creational.factory;

/**
 * Problem: marketing wants to switch between SMS, email, and push without
 * rewriting order-tracking code.
 *
 * Factory hides the creation details and returns the right channel.
 */
public class Main {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();

        Notification email = factory.create(NotificationFactory.Channel.EMAIL);
        Notification sms = factory.create(NotificationFactory.Channel.SMS);
        Notification push = factory.create(NotificationFactory.Channel.PUSH);

        email.send("Order #123 shipped");
        sms.send("Promo code SAVE10");
        push.send("Security alert: new login");
    }
}

