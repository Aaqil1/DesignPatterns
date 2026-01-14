package com.example.designpatterns.structural.composite;

/**
 * Problem: Product managers estimate epics and tasks, but current code treats
 * them separately. Teams want to print and sum estimates uniformly.
 *
 * Composite lets clients treat individual tasks and epics uniformly.
 */
public class Main {
    public static void main(String[] args) {
        WorkItem epic = new Epic("Checkout Revamp")
                .add(new Task("Add Apple Pay", 8))
                .add(new Task("Refactor cart", 5))
                .add(new Epic("QA")
                        .add(new Task("Regression", 6))
                        .add(new Task("Performance", 4)));

        epic.print("");
        System.out.println("Total estimate: " + epic.estimateHours() + "h");
    }
}
