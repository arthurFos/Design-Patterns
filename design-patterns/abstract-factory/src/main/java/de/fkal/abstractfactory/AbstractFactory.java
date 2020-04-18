package de.fkal.abstractfactory;

public interface AbstractFactory<T> {
    T create(String type);
}
