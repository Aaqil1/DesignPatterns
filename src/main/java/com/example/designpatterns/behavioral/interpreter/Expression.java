package com.example.designpatterns.behavioral.interpreter;

import java.util.Map;

/**
 * Expression interface declares interpret.
 */
public interface Expression {
    boolean interpret(Map<String, Boolean> context);
}
