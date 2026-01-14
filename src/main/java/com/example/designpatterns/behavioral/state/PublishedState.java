package com.example.designpatterns.behavioral.state;

public class PublishedState implements DocumentState {
    @Override
    public void publish(Document document) {
        System.out.println("Already published. No action taken.");
    }

    @Override
    public String name() {
        return "Published";
    }
}
