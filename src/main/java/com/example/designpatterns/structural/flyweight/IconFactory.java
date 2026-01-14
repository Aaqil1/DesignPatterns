package com.example.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Factory caches flyweight icons to reuse shared state.
 */
public class IconFactory {
    private final Map<String, Icon> cache = new HashMap<>();

    public Icon getIcon(String type, String color) {
        String key = type + "-" + color;
        return cache.computeIfAbsent(key, k -> new Icon(type, color));
    }
}
