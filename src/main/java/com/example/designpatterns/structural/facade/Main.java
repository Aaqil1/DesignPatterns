package com.example.designpatterns.structural.facade;

/**
 * Problem: Sales reps need to onboard trial users quickly. Directly calling
 * account, billing, and email services scattered across code caused errors.
 *
 * Facade offers a single, intention-revealing API that hides orchestration.
 */
public class Main {
    public static void main(String[] args) {
        OnboardingFacade facade = new OnboardingFacade();
        facade.onboard("Nora");
    }
}
