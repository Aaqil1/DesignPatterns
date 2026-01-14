package com.example.designpatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Registry holds named prototypes so clients can clone without knowing details.
 */
public class TemplateRegistry {
    private final Map<String, TaskTemplate> templates = new HashMap<>();

    public void register(String key, TaskTemplate template) {
        templates.put(key, template);
    }

    public TaskTemplate cloneOf(String key) {
        TaskTemplate template = templates.get(key);
        if (template == null) {
            throw new IllegalArgumentException("No template for key " + key);
        }
        return template.copy();
    }
}
