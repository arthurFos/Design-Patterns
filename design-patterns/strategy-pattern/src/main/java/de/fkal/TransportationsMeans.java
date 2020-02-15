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
public abstract class TransportationsMeans {
    protected MovesBehaviours movesBehaviours;
    
    public void doMove() {
        movesBehaviours.move();
    }
    
     /**
     * change run behaviour during the runtime
     */
    public void setMoveBehaviours(MovesBehaviours movesBehaviours) {
                this.movesBehaviours = movesBehaviours;
    }
}
