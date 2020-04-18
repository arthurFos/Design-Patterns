package de.fkal.client;

import de.fkal.abstractfactory.AbstractFactory;
import de.fkal.concretefactory.ColorFactory;
import de.fkal.concretefactory.ShapeFactory;
import de.fkal.concretefactory.SizeFactory;

public class FactoryProvider {
    public static AbstractFactory getFactory(String factoryType) {
        switch (factoryType.toLowerCase()) {
            case "shape":
                return new ShapeFactory();
            case "color":
                return new ColorFactory();
            case "size":
                return new SizeFactory();
            default:
                return null;
        }
    }
}
