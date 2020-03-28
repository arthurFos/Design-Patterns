/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fkal.decorator;

import fkal.component.Cocktail;

/**
 *
 * @author Arthur Fotso
 */
public abstract class AdditiveIncredients implements Cocktail {
    protected Cocktail cocktail;

    public AdditiveIncredients(Cocktail cocktail) {
        this.cocktail = cocktail;
    }
}
