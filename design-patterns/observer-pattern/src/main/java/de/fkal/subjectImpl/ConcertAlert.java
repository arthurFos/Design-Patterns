package de.fkal.subjectImpl;

import com.sun.istack.internal.NotNull;
import de.fkal.model.Concert;
import de.fkal.observer.Observer;
import de.fkal.subject.Subject;

import java.util.ArrayList;
import java.util.List;

public class ConcertAlert implements Subject {
    private Concert concert;
    private List<Observer> concertObservers;

    public ConcertAlert () {
        concertObservers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        this.concertObservers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
       this.concertObservers.removeIf(co -> co.equals(o));
    }

    @Override
    public void notifyObserver() {
        concertObservers.forEach(co -> co.update(this.concert));
    }

    public void updateConcert (@NotNull Concert concert) {
        this.concert.setCity(concert.getCity());
        this.concert.setCountry(concert.getCountry());
        this.concert.setDateAndTime(concert.getDateAndTime());
        this.concert.setName(concert.getName());
        this.concert.setType(concert.getType());

        notifyObserver();
    }
}
