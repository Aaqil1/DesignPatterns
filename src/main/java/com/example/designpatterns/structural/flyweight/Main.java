package com.example.designpatterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem: Rendering thousands of map markers with their own sprite objects
 * exhausted memory. Many markers share the same icon type.
 *
 * Flyweight reuses shared icon objects and keeps coordinates outside.
 */
public class Main {
    public static void main(String[] args) {
        IconFactory factory = new IconFactory();
        List<MapMarker> markers = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            markers.add(new MapMarker(i, i + 1, factory.getIcon("restaurant", "red")));
            markers.add(new MapMarker(i + 5, i + 6, factory.getIcon("park", "green")));
        }

        markers.forEach(MapMarker::render);
    }
}
