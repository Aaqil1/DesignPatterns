package com.example.designpatterns.structural.flyweight;

/**
 * Flyweight holding intrinsic (shared) state like sprite and color.
 */
public class Icon {
    private final String type;
    private final String color;

    Icon(String type, String color) {
        this.type = type;
        this.color = color;
    }

    public void draw(int x, int y) {
        System.out.println("Drawing " + type + " icon in " + color + " at (" + x + "," + y + ")");
    }
}
