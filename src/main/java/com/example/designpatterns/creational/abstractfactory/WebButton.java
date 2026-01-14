package com.example.designpatterns.creational.abstractfactory;

public class WebButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering web button with hover effect");
    }
}
