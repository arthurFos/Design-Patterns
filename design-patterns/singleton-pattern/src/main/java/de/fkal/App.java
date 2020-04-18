package de.fkal;

import lombok.extern.java.Log;

import de.fkal.singleton.Singleton;

import java.util.logging.Level;

@Log
public class App
{
    public static void main( String[] args )
    {
        Singleton singleton1 = Singleton.getInstance();
        singleton1.setName("Singleton 1");
        log.log(Level.INFO, "Singleton 1 {0}", singleton1);
        Singleton singleton2 = Singleton.getInstance();
        log.log(Level.INFO, "Singleton 2 {0}", singleton2);
        Singleton singleton3 = Singleton.getInstance();
        singleton1.setName("Singleton 3");
        log.log(Level.INFO, "Singleton 3 {0}", singleton3);

    }
}
