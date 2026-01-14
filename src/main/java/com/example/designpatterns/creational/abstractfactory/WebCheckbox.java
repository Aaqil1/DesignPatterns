package com.example.designpatterns.creational.abstractfactory;

public class WebCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering web checkbox with tooltip");
    }
}
