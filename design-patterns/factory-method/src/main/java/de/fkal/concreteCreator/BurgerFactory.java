package de.fkal.concreteCreator;

import de.fkal.concreteProduct.*;
import de.fkal.creator.Burgeria;
import de.fkal.product.Burger;

public class BurgerFactory extends Burgeria {
    @Override
    protected Burger toCreateBurger(String burgerTyp) {
        switch (burgerTyp.toLowerCase()) {
            case "beef":
                return new BeefBurger();
            case "bison":
                return new BisonBurger();
            case "black":
                return new BlackBeanBurger();
            case "elk":
                return new ElkBurger();
            case "veggie":
                return new VeggieBurger();
            default:
                return new SimpleBurger();
        }
    }
}
