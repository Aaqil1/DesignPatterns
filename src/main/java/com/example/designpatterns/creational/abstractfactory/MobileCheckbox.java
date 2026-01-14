package com.example.designpatterns.creational.abstractfactory;

public class MobileCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering mobile checkbox with large touch target");
    }
}
