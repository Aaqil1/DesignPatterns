package com.example.designpatterns.behavioral.chainofresponsibility;

public class DirectorHandler extends BaseSupportHandler {
    @Override
    protected boolean process(Ticket ticket) {
        if (ticket.getSeverity() == Ticket.Severity.HIGH) {
            System.out.println("Director resolved: " + ticket.getDescription());
            return true;
        }
        System.out.println("No handler could process: " + ticket.getDescription());
        return false;
    }
}
