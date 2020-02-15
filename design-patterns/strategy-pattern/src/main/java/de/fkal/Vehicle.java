/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.fkal;

/**
 *
 * @author Arthur Fotso
 */
public class Vehicle extends TransportationsMeans {
        
    /**
     * Default constructor
     */
    public Vehicle(){
        
    }
    
    public Vehicle(MovesBehaviours movesBehaviours){
        this.movesBehaviours = movesBehaviours;
    }
}
