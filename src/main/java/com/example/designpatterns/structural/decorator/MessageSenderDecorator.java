package com.example.designpatterns.structural.decorator;

/**
 * Base decorator that delegates to the wrapped component.
 */
public abstract class MessageSenderDecorator implements MessageSender {
    protected final MessageSender delegate;

    protected MessageSenderDecorator(MessageSender delegate) {
        this.delegate = delegate;
    }
}
