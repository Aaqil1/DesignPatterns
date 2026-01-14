package com.example.designpatterns.creational.abstractfactory;

/**
 * Client depends only on abstract factory to assemble a consistent screen.
 */
public class PaymentScreen {
    private final Button button;
    private final Checkbox checkbox;

    public PaymentScreen(WidgetFactory factory) {
        // Factory delivers a matched family of widgets for a platform.
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void render() {
        System.out.println("--- Rendering payment screen ---");
        checkbox.render();
        button.render();
    }
}
