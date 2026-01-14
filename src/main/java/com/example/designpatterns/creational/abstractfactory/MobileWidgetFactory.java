package com.example.designpatterns.creational.abstractfactory;

/**
 * Concrete factory for building a consistent mobile UI family.
 */
public class MobileWidgetFactory implements WidgetFactory {
    @Override
    public Button createButton() {
        return new MobileButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MobileCheckbox();
    }
}
