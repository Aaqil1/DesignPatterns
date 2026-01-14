package com.example.designpatterns.behavioral.memento;

/**
 * Problem: Writers need undo for text edits without exposing editor internals.
 *
 * Memento captures and restores state safely.
 */
public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        History history = new History();

        editor.type("Hello, ");
        history.push(editor.save());

        editor.type("world!");
        System.out.println("Current: " + editor.getContent());

        editor.restore(history.pop());
        System.out.println("After undo: " + editor.getContent());
    }
}
