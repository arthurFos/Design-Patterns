package de.fkal.observerImpl;

import de.fkal.Show;
import de.fkal.model.Concert;
import de.fkal.observer.Observer;
import de.fkal.subject.Subject;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class ObserverImpl1 implements Observer {
    private Subject subjectImpl;

    public ObserverImpl1(Subject concertAlert) {
        this.subjectImpl = concertAlert;
        this.subjectImpl.registerObserver(this);
    }

    @Override
    public void update(Concert concert) {
        Show show = () -> System.out.println(concert.toString(this));
    }
}
