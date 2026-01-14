package com.example.designpatterns.creational.abstractfactory;

/**
 * Concrete factory for building a consistent web UI family.
 */
public class WebWidgetFactory implements WidgetFactory {
    @Override
    public Button createButton() {
        return new WebButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WebCheckbox();
    }
}
