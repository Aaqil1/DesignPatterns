package com.example.designpatterns.behavioral.interpreter;

import java.util.Map;

/**
 * Terminal expression representing a literal boolean.
 */
public class LiteralExpression implements Expression {
    private final boolean value;

    public LiteralExpression(boolean value) {
        this.value = value;
    }

    @Override
    public boolean interpret(Map<String, Boolean> context) {
        return value;
    }
}
