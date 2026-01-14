package com.example.designpatterns.creational.builder;

/**
 * Builder defines the steps for constructing a House.
 */
public interface HouseBuilder {
    HouseBuilder withRooms(int rooms);
    HouseBuilder withGarage();
    HouseBuilder withGarden();
    HouseBuilder withAutomation();
    House build();
}
