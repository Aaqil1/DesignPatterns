package com.example.designpatterns.behavioral.mediator;

/**
 * Mediator interface for routing messages.
 */
public interface ChatMediator {
    void register(Participant participant);
    void broadcast(String from, String message);
}
