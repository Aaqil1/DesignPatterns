package com.example.designpatterns.structural.proxy;

/**
 * Heavy real object that simulates expensive loading.
 */
public class RealImage implements Image {
    private final String filePath;

    public RealImage(String filePath) {
        this.filePath = filePath;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading image from disk: " + filePath);
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + filePath);
    }
}
