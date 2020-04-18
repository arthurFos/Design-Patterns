package de.fkal.concretefactory;

import de.fkal.abstractfactory.AbstractFactory;
import de.fkal.abstractproduct.Shape;
import de.fkal.concreteproduct.shape.Rectangle;
import de.fkal.concreteproduct.shape.Square;
import de.fkal.concreteproduct.shape.Triangle;

public class ShapeFactory implements AbstractFactory<Shape> {
    @Override
    public Shape create(String type) {
        switch (type.toLowerCase()) {
            case "rectangle":
                return new Rectangle();
            case "square":
                return new Square();
            case "triangle":
                return new Triangle();
            default:
                return null;
        }
    }
}
