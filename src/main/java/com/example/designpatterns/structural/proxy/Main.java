package com.example.designpatterns.structural.proxy;

/**
 * Problem: Loading hi-res product images during listing slowed the UI, even
 * when the user never opened them.
 *
 * Proxy delays the heavy load until display() is called.
 */
public class Main {
    public static void main(String[] args) {
        Image thumbnail = new LazyImageProxy("/images/product-hero.png");

        // Listing view does nothing heavy yet
        System.out.println("Listing renders placeholder...");

        // Detail view triggers actual load
        thumbnail.display();
        thumbnail.display();
    }
}
