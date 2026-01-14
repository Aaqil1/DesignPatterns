package com.example.designpatterns.behavioral.state;

public interface DocumentState {
    void publish(Document document);
    String name();
}
