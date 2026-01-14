package com.example.designpatterns.creational.builder;

/**
 * Concrete builder tuned for cost-sensitive houses.
 */
public class BudgetHouseBuilder implements HouseBuilder {
    private final House house = new House();

    @Override
    public HouseBuilder withRooms(int rooms) {
        house.setRooms(Math.max(2, rooms));
        return this;
    }

    @Override
    public HouseBuilder withGarage() {
        house.setHasGarage(false); // skip to save cost
        return this;
    }

    @Override
    public HouseBuilder withGarden() {
        house.setHasGarden(true);
        return this;
    }

    @Override
    public HouseBuilder withAutomation() {
        house.setHasAutomation(false);
        return this;
    }

    @Override
    public House build() {
        return house;
    }
}
