package com.example.designpatterns.behavioral.mediator;

/**
 * Problem: Engineers chatted via direct references, creating spaghetti dependencies.
 *
 * Mediator centralizes communication so colleagues stay decoupled.
 */
public class Main {
    public static void main(String[] args) {
        ChatMediator mediator = new TeamChatMediator();
        Participant alice = new Participant("Alice", mediator);
        Participant bob = new Participant("Bob", mediator);
        Participant carol = new Participant("Carol", mediator);

        alice.send("Deploying build 42");
        carol.send("Running smoke tests");
        bob.send("LGTM");
    }
}
