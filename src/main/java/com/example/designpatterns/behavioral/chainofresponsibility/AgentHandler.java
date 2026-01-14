package com.example.designpatterns.behavioral.chainofresponsibility;

public class AgentHandler extends BaseSupportHandler {
    @Override
    protected boolean process(Ticket ticket) {
        if (ticket.getSeverity() == Ticket.Severity.LOW) {
            System.out.println("Agent resolved: " + ticket.getDescription());
            return true;
        }
        return false;
    }
}
