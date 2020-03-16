package de.fkal.subjectImpl;

import de.fkal.ConcertDataGenerator;
import de.fkal.model.Concert;
import de.fkal.observer.Observer;
import de.fkal.subject.Subject;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

public class ConcertAlert implements Subject {
    private Concert concert;
    private List<Observer> concertObservers;
    private ConcertDataGenerator concertDataGenerator;


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
        AtomicInteger numberOfConcertAlertToNotify = new AtomicInteger(15);
        Timer timer = new Timer();

        while (Integer.signum(numberOfConcertAlertToNotify.getAndDecrement()) == 1) {

            System.out.println("Hey");

            TimerTask timerTask = new TimerTask() {
                @Override
                public void run() {
                    System.out.println("hello");
                    Concert concert = concertDataGenerator.generateConcert();
                    updateConcert(concert);
                }
            };

            timer.schedule(timerTask, 2000, 5000);
            concertObservers.forEach(co -> co.update(this.concert));
        }
    }

    public void updateConcert (Concert concert) {
        this.concert.setCity(concert.getCity());
        this.concert.setCountry(concert.getCountry());
        this.concert.setDateAndTime(concert.getDateAndTime());
        this.concert.setName(concert.getName());
        this.concert.setType(concert.getType());

        notifyObserver();
    }
}
