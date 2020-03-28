/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fkal.concretDecorator;

import fkal.component.Cocktail;
import fkal.decorator.AdditiveIncredients;

/**
 *
 * @author Arthur Fotso
 */
public class Rum extends AdditiveIncredients {

    public Rum(Cocktail cocktail) {
        super(cocktail);
    }

    @Override
    public String getName() {
       return this.cocktail.getName() + ", Rum";
    }

    @Override
    public double getPrice() {
        return this.cocktail.getPrice() + 2.0;
    }
    
}
