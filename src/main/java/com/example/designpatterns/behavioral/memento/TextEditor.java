package com.example.designpatterns.behavioral.memento;

/**
 * Originator that can create and restore snapshots.
 */
public class TextEditor {
    private String content = "";

    public void type(String text) {
        content += text;
    }

    public Snapshot save() {
        return new Snapshot(content);
    }

    public void restore(Snapshot snapshot) {
        this.content = snapshot.getContent();
    }

    public String getContent() {
        return content;
    }
}
