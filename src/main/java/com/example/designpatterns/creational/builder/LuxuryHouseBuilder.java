package com.example.designpatterns.creational.builder;

/**
 * Concrete builder tuned for premium houses.
 */
public class LuxuryHouseBuilder implements HouseBuilder {
    private final House house = new House();

    @Override
    public HouseBuilder withRooms(int rooms) {
        house.setRooms(Math.max(4, rooms));
        return this;
    }

    @Override
    public HouseBuilder withGarage() {
        house.setHasGarage(true);
        return this;
    }

    @Override
    public HouseBuilder withGarden() {
        house.setHasGarden(true);
        return this;
    }

    @Override
    public HouseBuilder withAutomation() {
        house.setHasAutomation(true);
        return this;
    }

    @Override
    public House build() {
        return house;
    }
}
