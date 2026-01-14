package com.example.designpatterns.creational.builder;

/**
 * Complex object composed gradually by a builder.
 */
public class House {
    private int rooms;
    private boolean hasGarage;
    private boolean hasGarden;
    private boolean hasAutomation;

    void setRooms(int rooms) {
        this.rooms = rooms;
    }

    void setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

    void setHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
    }

    void setHasAutomation(boolean hasAutomation) {
        this.hasAutomation = hasAutomation;
    }

    @Override
    public String toString() {
        return "House{" +
                "rooms=" + rooms +
                ", garage=" + hasGarage +
                ", garden=" + hasGarden +
                ", automation=" + hasAutomation +
                '}';
    }
}
