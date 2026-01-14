package com.example.designpatterns.behavioral.chainofresponsibility;

public abstract class BaseSupportHandler implements SupportHandler {
    private SupportHandler next;

    @Override
    public void setNext(SupportHandler next) {
        this.next = next;
    }

    @Override
    public void handle(Ticket ticket) {
        if (!process(ticket) && next != null) {
            next.handle(ticket);
        }
    }

    /**
     * @return true if handled, false to pass along
     */
    protected abstract boolean process(Ticket ticket);
}
