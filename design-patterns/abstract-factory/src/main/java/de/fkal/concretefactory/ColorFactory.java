package de.fkal.concretefactory;

import de.fkal.abstractfactory.AbstractFactory;
import de.fkal.abstractproduct.Color;
import de.fkal.concreteproduct.color.Blue;
import de.fkal.concreteproduct.color.Red;
import de.fkal.concreteproduct.color.White;
import de.fkal.concreteproduct.color.Yellow;
import lombok.Data;

@Data
public class ColorFactory implements AbstractFactory<Color> {
    @Override
    public Color create(String type) {
        switch (type.toLowerCase()) {
            case "red":
                return new Red();
            case "blue":
                return new Blue();
            case "yellow":
                return new Yellow();
            case "white":
                return new White();
            default:
                return null;
        }
    }
}
