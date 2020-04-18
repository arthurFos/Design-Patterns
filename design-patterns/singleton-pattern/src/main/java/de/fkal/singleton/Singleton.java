package de.fkal.singleton;

public class Singleton {
    private String name;
    private static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getInstance() {
        singleton = singleton == null ? new Singleton() : singleton;
        return singleton;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
