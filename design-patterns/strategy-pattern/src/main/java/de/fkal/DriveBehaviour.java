/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.fkal;

/**
 * capsulates the drive behaviour
 * @author Arthur Fotso
 */
public class DriveBehaviour implements MovesBehaviours {

    @Override
    public void move() {
        logger.info("I drive ...");
    }
    
}
