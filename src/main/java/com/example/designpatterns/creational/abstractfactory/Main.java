package com.example.designpatterns.creational.abstractfactory;

/**
 * Problem: Design needs platform-specific widgets (mobile vs web) but screens
 * should stay unaware of concrete classes to keep consistency and reduce churn.
 *
 * Abstract Factory supplies whole families of related products without the
 * client knowing their concrete types.
 */
public class Main {
    public static void main(String[] args) {
        WidgetFactory factory = pickFactory("mobile");
        PaymentScreen screen = new PaymentScreen(factory);
        screen.render();

        factory = pickFactory("web");
        screen = new PaymentScreen(factory);
        screen.render();
    }

    private static WidgetFactory pickFactory(String platform) {
        if ("mobile".equalsIgnoreCase(platform)) {
            return new MobileWidgetFactory();
        }
        return new WebWidgetFactory();
    }
}
