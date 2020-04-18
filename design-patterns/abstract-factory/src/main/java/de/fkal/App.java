package de.fkal;

import de.fkal.client.Figure;
import lombok.extern.java.Log;

import java.util.logging.Level;

@Log
public class App 
{
    public static void main( String[] args )
    {
        Figure figure1 = new Figure("white", "small", "square");
        log.log(Level.INFO, "The figure -> {0}", figure1);

        Figure figure2 = new Figure("red", "big", "rectangle");
        log.log(Level.INFO, "The figure -> {0}", figure2);
    }
}
