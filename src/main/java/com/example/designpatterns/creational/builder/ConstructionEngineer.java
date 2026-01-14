package com.example.designpatterns.creational.builder;

/**
 * Director orchestrates building steps to ensure order and completeness.
 */
public class ConstructionEngineer {
    private final HouseBuilder builder;

    public ConstructionEngineer(HouseBuilder builder) {
        this.builder = builder;
    }

    public House constructFamilyHome() {
        // Fixed sequence that yields a consistent blueprint
        return builder
                .withRooms(3)
                .withGarage()
                .withGarden()
                .withAutomation()
                .build();
    }
}
