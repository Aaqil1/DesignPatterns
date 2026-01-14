package com.example.designpatterns.creational.abstractfactory;

/**
 * Abstract Factory defines a family of related UI components.
 */
public interface WidgetFactory {
    Button createButton();
    Checkbox createCheckbox();
}
