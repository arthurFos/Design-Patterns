package de.fkal.creator;

import de.fkal.product.Burger;
import lombok.extern.java.Log;

import java.util.logging.Level;

@Log
public abstract class Burgeria {
    Burger burger = null;

    public Burger toOrderBurger(String burgerTyp) {
        burger = toCreateBurger(burgerTyp);

        toPrepareBurger(burger);
        toBakeBurger(burger);
        toCutBurger(burger);
        toPackeBurger(burger);

        return burger;
    }

    protected abstract Burger toCreateBurger(String burgerTyp);

    private void toPrepareBurger(Burger burger) {
        log.log(Level.INFO, "The burger {0} was prepared", burger.getName());
    }

    private void toBakeBurger(Burger burger) {
        log.log(Level.INFO, "The burger {0} was baked", burger.getName());
    }

    private void toCutBurger(Burger burger) {
        log.log(Level.INFO, "The burger {0} was sliced", burger.getName());
    }

    private void toPackeBurger(Burger burger) {
        log.log(Level.INFO, "The burger {0} was packed", burger.getName());
    }
}
