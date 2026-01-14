package com.example.designpatterns.behavioral.mediator;

/**
 * Colleague that communicates only via mediator.
 */
public class Participant {
    private final String name;
    private final ChatMediator mediator;

    public Participant(String name, ChatMediator mediator) {
        this.name = name;
        this.mediator = mediator;
        mediator.register(this);
    }

    public String getName() {
        return name;
    }

    public void send(String message) {
        mediator.broadcast(name, message);
    }

    public void receive(String from, String message) {
        System.out.println(name + " received from " + from + ": " + message);
    }
}
