package com.example.designpatterns.creational.prototype;

import java.util.Arrays;

/**
 * Problem: Product managers keep asking for pre-filled Jira tasks. Copy/paste
 * leads to mistakes and shared mutable checklists.
 *
 * Prototype lets us clone a pre-approved template and tweak only what differs.
 */
public class Main {
    public static void main(String[] args) {
        TemplateRegistry registry = new TemplateRegistry();
        registry.register("bugfix", new TaskTemplate(
                "Bugfix task",
                "Reproduce, fix, verify, deploy",
                Arrays.asList("Reproduce", "Write test", "Patch", "Deploy")
        ));

        TaskTemplate fixTicket = registry.cloneOf("bugfix");
        fixTicket.setTitle("Bugfix: Payment failure");
        fixTicket.getChecklist().add("Postmortem");

        TaskTemplate anotherFix = registry.cloneOf("bugfix");

        System.out.println(fixTicket);
        System.out.println(anotherFix);
    }
}
