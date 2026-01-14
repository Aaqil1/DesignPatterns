package com.example.designpatterns.creational.factory;

/**
 * Factory centralizes creation logic, so calling code is not tied
 * to specific notification implementations.
 */
public class NotificationFactory {

    public enum Channel {
        EMAIL, SMS, PUSH
    }

    public Notification create(Channel channel) {
        return switch (channel) {
            case EMAIL -> new EmailNotification();
            case SMS -> new SmsNotification();
            case PUSH -> new PushNotification();
        };
    }
}

