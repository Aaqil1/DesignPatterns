package com.example.designpatterns.creational.prototype;

/**
 * Prototype interface to support cloning without binding to concrete types.
 */
public interface Prototype<T> {
    T copy();
}
