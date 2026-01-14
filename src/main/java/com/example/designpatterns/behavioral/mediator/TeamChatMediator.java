package com.example.designpatterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete mediator that relays messages to all participants.
 */
public class TeamChatMediator implements ChatMediator {
    private final List<Participant> participants = new ArrayList<>();

    @Override
    public void register(Participant participant) {
        participants.add(participant);
    }

    @Override
    public void broadcast(String from, String message) {
        participants.stream()
                .filter(p -> !p.getName().equals(from))
                .forEach(p -> p.receive(from, message));
    }
}
