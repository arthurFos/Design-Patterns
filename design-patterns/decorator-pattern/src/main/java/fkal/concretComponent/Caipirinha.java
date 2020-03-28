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
public class Caipirinha implements Cocktail {

    @Override
    public String getName() {
        return "CAIPIRINHA";
    }

    @Override
    public double getPrice() {
        return 9.50;
    }
}
