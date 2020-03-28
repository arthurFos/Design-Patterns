/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fkal.component;

/**
 *
 * @author Arthur Fotso
 */
public interface Cocktail {
    
    public String getName();
    
    public double getPrice();
    
    default String getDescription() {
        return "Cocktail: " + getName() + "\t\t Price: " + getPrice() + "$";
    }
}
