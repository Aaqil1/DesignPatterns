package com.example.designpatterns.behavioral.chainofresponsibility;

public class SupervisorHandler extends BaseSupportHandler {
    @Override
    protected boolean process(Ticket ticket) {
        if (ticket.getSeverity() == Ticket.Severity.MEDIUM) {
            System.out.println("Supervisor resolved: " + ticket.getDescription());
            return true;
        }
        return false;
    }
}
