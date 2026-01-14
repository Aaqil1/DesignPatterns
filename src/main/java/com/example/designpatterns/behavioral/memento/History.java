package com.example.designpatterns.behavioral.memento;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Caretaker managing history of snapshots.
 */
public class History {
    private final Deque<Snapshot> snapshots = new ArrayDeque<>();

    public void push(Snapshot snapshot) {
        snapshots.push(snapshot);
    }

    public Snapshot pop() {
        if (snapshots.isEmpty()) {
            throw new IllegalStateException("No snapshots available");
        }
        return snapshots.pop();
    }
}
