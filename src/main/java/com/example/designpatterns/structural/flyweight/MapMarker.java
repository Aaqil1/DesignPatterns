package com.example.designpatterns.structural.flyweight;

/**
 * Context stores extrinsic state (coordinates) and references a shared icon.
 */
public class MapMarker {
    private final int x;
    private final int y;
    private final Icon icon;

    public MapMarker(int x, int y, Icon icon) {
        this.x = x;
        this.y = y;
        this.icon = icon;
    }

    public void render() {
        icon.draw(x, y);
    }
}
