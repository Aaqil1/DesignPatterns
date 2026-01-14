package com.example.designpatterns.structural.composite;

public class Task implements WorkItem {
    private final String name;
    private final int hours;

    public Task(String name, int hours) {
        this.name = name;
        this.hours = hours;
    }

    @Override
    public int estimateHours() {
        return hours;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "Task: " + name + " (" + hours + "h)");
    }
}
