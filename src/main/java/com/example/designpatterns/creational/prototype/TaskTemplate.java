package com.example.designpatterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete prototype representing a reusable task template.
 */
public class TaskTemplate implements Prototype<TaskTemplate> {
    private String title;
    private String description;
    private List<String> checklist;

    public TaskTemplate(String title, String description, List<String> checklist) {
        this.title = title;
        this.description = description;
        this.checklist = new ArrayList<>(checklist);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getChecklist() {
        return checklist;
    }

    @Override
    public TaskTemplate copy() {
        // Deep copy the checklist to avoid shared mutable state
        return new TaskTemplate(title, description, new ArrayList<>(checklist));
    }

    @Override
    public String toString() {
        return "TaskTemplate{" +
                "title='" + title + '\'' +
                ", checklist=" + checklist +
                '}';
    }
}
