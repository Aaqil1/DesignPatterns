package com.example.designpatterns.structural.composite;

/**
 * Component interface for both leaf tasks and composite epics.
 */
public interface WorkItem {
    int estimateHours();
    void print(String indent);
}
