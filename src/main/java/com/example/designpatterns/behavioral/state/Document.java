package com.example.designpatterns.behavioral.state;

/**
 * Context that changes behavior based on current state.
 */
public class Document {
    private DocumentState state = new DraftState();

    public void publish() {
        state.publish(this);
    }

    void setState(DocumentState state) {
        this.state = state;
    }

    public String currentState() {
        return state.name();
    }
}
