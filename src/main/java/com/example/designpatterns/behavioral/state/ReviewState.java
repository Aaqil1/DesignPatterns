package com.example.designpatterns.behavioral.state;

public class ReviewState implements DocumentState {
    @Override
    public void publish(Document document) {
        System.out.println("Approved and publishing...");
        document.setState(new PublishedState());
    }

    @Override
    public String name() {
        return "In Review";
    }
}
