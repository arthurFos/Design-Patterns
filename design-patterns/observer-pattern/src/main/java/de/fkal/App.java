package de.fkal;

import de.fkal.observerImpl.ObserverImpl1;
import de.fkal.observerImpl.ObserverImpl2;
import de.fkal.observerImpl.ObserverImpl3;
import de.fkal.subjectImpl.ConcertAlert;

import javax.security.auth.Subject;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ConcertAlert concertAlert = new ConcertAlert();
        ObserverImpl1 observerImpl1 = new ObserverImpl1(concertAlert);
        ObserverImpl2 observerImpl2 = new ObserverImpl2(concertAlert);
        ObserverImpl3 observerImpl3 = new ObserverImpl3(concertAlert);

    }
}
