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
public class Tequila extends AdditiveIncredients {

    public Tequila(Cocktail cocktail) {
        super(cocktail);
    }
    
    @Override
    public String getName() {
        return this.cocktail.getName() + ", Tequila";
    }

    @Override
    public double getPrice() {
        return this.cocktail.getPrice() + 1.5;
    }
    
}
