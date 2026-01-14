package com.example.designpatterns.behavioral.state;

/**
 * Problem: Document publishing workflow changed over time. Large switch/case
 * blocks scattered across code were fragile and duplicated.
 *
 * State localizes behavior per state and lets the document change its own state.
 */
public class Main {
    public static void main(String[] args) {
        Document doc = new Document();
        System.out.println("State: " + doc.currentState());

        doc.publish();
        System.out.println("State: " + doc.currentState());

        doc.publish();
        System.out.println("State: " + doc.currentState());
    }
}
