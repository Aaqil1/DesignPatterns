package com.example.designpatterns.behavioral.chainofresponsibility;

/**
 * Problem: Support tickets arrive with varying severity. Without a chain,
 * callers had to know which handler to contact, causing misrouted requests.
 *
 * Chain of Responsibility passes the ticket along until someone handles it.
 */
public class Main {
    public static void main(String[] args) {
        SupportHandler agent = new AgentHandler();
        SupportHandler supervisor = new SupervisorHandler();
        SupportHandler director = new DirectorHandler();

        agent.setNext(supervisor);
        supervisor.setNext(director);

        agent.handle(new Ticket("Password reset", Ticket.Severity.LOW));
        agent.handle(new Ticket("Checkout bug", Ticket.Severity.MEDIUM));
        agent.handle(new Ticket("Data breach", Ticket.Severity.HIGH));
    }
}
