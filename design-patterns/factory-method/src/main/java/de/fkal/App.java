package de.fkal;

import de.fkal.concreteCreator.BurgerFactory;
import de.fkal.creator.Burgeria;
import de.fkal.product.Burger;
import lombok.extern.java.Log;

import java.util.logging.Level;

@Log
public class App
{
    public static void main( String[] args )
    {
        Burgeria myBurgeria = new BurgerFactory();
        Burger beefBurger = myBurgeria.toOrderBurger("beef");

        log.log(Level.INFO, "created Burger {0}", beefBurger);
    }
}
