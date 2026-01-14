package com.example.designpatterns.creational.abstractfactory;

public class MobileButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering mobile button with thumb-friendly hitbox");
    }
}
