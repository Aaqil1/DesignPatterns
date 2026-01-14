package com.example.designpatterns.behavioral.state;

public class DraftState implements DocumentState {
    @Override
    public void publish(Document document) {
        System.out.println("Submitting for review...");
        document.setState(new ReviewState());
    }

    @Override
    public String name() {
        return "Draft";
    }
}
