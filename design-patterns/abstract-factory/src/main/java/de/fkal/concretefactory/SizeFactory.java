package de.fkal.concretefactory;

import de.fkal.abstractfactory.AbstractFactory;
import de.fkal.abstractproduct.Size;
import de.fkal.concreteproduct.size.Big;
import de.fkal.concreteproduct.size.Middle;
import de.fkal.concreteproduct.size.Small;

public class SizeFactory implements AbstractFactory<Size> {
    @Override
    public Size create(String type) {
        switch (type.toLowerCase()) {
            case "big":
                return new Big();
            case "middle":
                return new Middle();
            case "small":
                return new Small();
            default:
                return null;
        }
    }
}
