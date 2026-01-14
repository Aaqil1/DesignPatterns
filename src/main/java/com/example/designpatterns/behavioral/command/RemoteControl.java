package com.example.designpatterns.behavioral.command;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Invoker triggers commands and keeps history for undo-like behavior.
 */
public class RemoteControl {
    private final Deque<Command> history = new ArrayDeque<>();

    public void press(Command command) {
        history.push(command);
        command.execute();
    }

    public void replay() {
        System.out.println("Replaying last " + history.size() + " commands:");
        history.descendingIterator().forEachRemaining(Command::execute);
    }
}
