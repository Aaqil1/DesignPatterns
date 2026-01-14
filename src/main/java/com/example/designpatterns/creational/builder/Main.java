package com.example.designpatterns.creational.builder;

/**
 * Problem: Sales needs variations of a house (budget vs luxury) with many
 * optional parts. Telescoping constructors became unreadable and error-prone.
 *
 * Builder separates the construction process from representation, so the same
 * steps can produce different variants.
 */
public class Main {
    public static void main(String[] args) {
        ConstructionEngineer budgetEngineer = new ConstructionEngineer(new BudgetHouseBuilder());
        House budgetHouse = budgetEngineer.constructFamilyHome();
        System.out.println("Budget plan -> " + budgetHouse);

        ConstructionEngineer luxuryEngineer = new ConstructionEngineer(new LuxuryHouseBuilder());
        House luxuryHouse = luxuryEngineer.constructFamilyHome();
        System.out.println("Luxury plan -> " + luxuryHouse);
    }
}
