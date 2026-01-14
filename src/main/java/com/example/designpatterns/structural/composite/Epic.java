package com.example.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Epic implements WorkItem {
    private final String name;
    private final List<WorkItem> children = new ArrayList<>();

    public Epic(String name) {
        this.name = name;
    }

    public Epic add(WorkItem item) {
        children.add(item);
        return this;
    }

    @Override
    public int estimateHours() {
        return children.stream().mapToInt(WorkItem::estimateHours).sum();
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "Epic: " + name + " (" + estimateHours() + "h)");
        children.forEach(child -> child.print(indent + "  "));
    }
}
