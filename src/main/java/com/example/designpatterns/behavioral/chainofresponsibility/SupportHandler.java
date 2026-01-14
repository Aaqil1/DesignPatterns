package com.example.designpatterns.behavioral.chainofresponsibility;

public interface SupportHandler {
    void setNext(SupportHandler next);
    void handle(Ticket ticket);
}
