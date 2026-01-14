package com.example.designpatterns.behavioral.chainofresponsibility;

public class Ticket {
    public enum Severity { LOW, MEDIUM, HIGH }

    private final String description;
    private final Severity severity;

    public Ticket(String description, Severity severity) {
        this.description = description;
        this.severity = severity;
    }

    public String getDescription() {
        return description;
    }

    public Severity getSeverity() {
        return severity;
    }
}
