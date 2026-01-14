package com.example.designpatterns.behavioral.memento;

/**
 * Memento storing editor state.
 */
public class Snapshot {
    private final String content;

    public Snapshot(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
