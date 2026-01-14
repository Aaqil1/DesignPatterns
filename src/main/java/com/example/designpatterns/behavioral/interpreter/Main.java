package com.example.designpatterns.behavioral.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem: Feature toggles are combined with boolean logic. Hard-coding nested
 * ifs made changes risky.
 *
 * Interpreter models the grammar so expressions are composable and testable.
 */
public class Main {
    public static void main(String[] args) {
        Map<String, Boolean> context = new HashMap<>();
        context.put("isPremium", true);
        context.put("hasTrial", false);
        context.put("betaEnabled", true);

        // Expression: (isPremium OR hasTrial) AND betaEnabled
        Expression expr = new AndExpression(
                new OrExpression(new VariableExpression("isPremium"), new VariableExpression("hasTrial")),
                new VariableExpression("betaEnabled"));

        System.out.println("Feature enabled? " + expr.interpret(context));
        Expression negated = new NotExpression(expr);
        System.out.println("Negated result: " + negated.interpret(context));
    }
}
