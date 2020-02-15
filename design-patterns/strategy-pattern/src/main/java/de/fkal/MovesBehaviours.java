/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.fkal;

import java.util.logging.Logger;

/**
 * This interface should be implemented by every added transport behaviours
 * It give the possiblity of the transport behaviours to define how they move
 * Together with every transport behaviours classes, which implement this 
 * interface, we capsulate the differents move behaviours
 * @author Arthur Fotso
 */
public interface MovesBehaviours {
    
    public final Logger logger = Logger.getLogger(MovesBehaviours.class.getName());
    
    public void move();
}
