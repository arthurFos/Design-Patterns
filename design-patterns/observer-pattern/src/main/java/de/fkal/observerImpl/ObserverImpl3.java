package de.fkal.observerImpl;

import de.fkal.Show;
import de.fkal.model.Concert;
import de.fkal.observer.Observer;
import de.fkal.subject.Subject;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class ObserverImpl3 implements Observer {
    private Subject concertImpl;

    public ObserverImpl3(Subject concertAlert) {
        this.concertImpl = concertAlert;
        this.concertImpl.registerObserver(this);
    }

    @Override
    public void update(Concert concert) {
        Show show = () -> concert.toString(this);
    }
}
