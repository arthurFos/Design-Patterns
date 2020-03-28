/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fkal.concretComponent;

import fkal.component.Cocktail;

/**
 *
 * @author Arthur Fotso
 */
public class Mojito implements Cocktail {

    @Override
    public String getName() {
        return "MOJITO";
    }

    @Override
    public double getPrice() {
        return 8.50;
    }
    
}
