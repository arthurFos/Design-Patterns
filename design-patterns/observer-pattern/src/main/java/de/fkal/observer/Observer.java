package de.fkal.observer;

import de.fkal.model.Concert;

public interface Observer {
    void update(Concert concert);
}
