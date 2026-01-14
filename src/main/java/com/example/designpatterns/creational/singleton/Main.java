package com.example.designpatterns.creational.singleton;

/**
 * Demo for Singleton:
 * - Teams need one configuration hub for cross-cutting flags.
 * - Singleton gives a single, lazy, globally accessible instance.
 */
public class Main {
    public static void main(String[] args) {
        ConfigurationManager firstRef = ConfigurationManager.getInstance();
        ConfigurationManager secondRef = ConfigurationManager.getInstance();

        System.out.println("Same instance? " + (firstRef == secondRef));

        firstRef.updateSetting("ui.theme", "dark");
        System.out.println("Theme via secondRef: " + secondRef.getSetting("ui.theme"));
    }
}

