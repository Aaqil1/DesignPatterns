package com.example.designpatterns.structural.proxy;

/**
 * Proxy defers creation of the heavy RealImage until actually needed.
 */
public class LazyImageProxy implements Image {
    private final String filePath;
    private RealImage realImage;

    public LazyImageProxy(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filePath);
        }
        realImage.display();
    }
}
