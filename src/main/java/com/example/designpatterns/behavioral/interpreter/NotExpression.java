package com.example.designpatterns.behavioral.interpreter;

import java.util.Map;

public class NotExpression implements Expression {
    private final Expression inner;

    public NotExpression(Expression inner) {
        this.inner = inner;
    }

    @Override
    public boolean interpret(Map<String, Boolean> context) {
        return !inner.interpret(context);
    }
}
