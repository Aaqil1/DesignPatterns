package com.example.designpatterns.behavioral.interpreter;

import java.util.Map;

/**
 * Terminal expression that resolves a variable from the context map.
 */
public class VariableExpression implements Expression {
    private final String name;

    public VariableExpression(String name) {
        this.name = name;
    }

    @Override
    public boolean interpret(Map<String, Boolean> context) {
        Boolean value = context.get(name);
        if (value == null) {
            throw new IllegalArgumentException("Missing variable: " + name);
        }
        return value;
    }
}
