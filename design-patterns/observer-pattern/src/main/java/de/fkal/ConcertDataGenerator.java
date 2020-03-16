package de.fkal;

import de.fkal.model.Concert;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ConcertDataGenerator {

    Random random = new Random();

    public Concert generateConcert() {
        List<Concert> concerts  = getConcertData();
        int i = random.nextInt(concerts.size());
        return concerts.get(i);
    }

    public List<Concert> getConcertData() {
        LocalDate baseDate = LocalDate.of(2020, 04, 12);
        LocalTime baseTime = LocalTime.of(18, 15);
        ZoneId baseZoneId = ZoneId.of("GMT+01:00");
        ZonedDateTime baseDateTime = ZonedDateTime.of(baseDate, baseTime, baseZoneId);

        Concert concert1 = new Concert("The Paul McCartney World Tour", "Rock", "Brazil", "Rio de Janeiro", baseDateTime);
        Concert concert2 = new Concert("Who's That Girl World Tour", "Pop", "France", "Paris", baseDateTime.plusMonths(2));
        Concert concert3 = new Concert("Bad World Tour", "Pop", "England", "Liverpool", baseDateTime.plusMonths(5));
        Concert concert4 = new Concert("THE WORLD’S GREATEST RAP SHOW EVER", "Rap", "USA", "Indiana", baseDateTime.plusMonths(6));
        Concert concert5 = new Concert("RAISING HELL TOUR ", "HipHop", "USA", "New York", baseDateTime.plusMonths(10));

        List<Concert> concerts = new ArrayList<>();
        concerts.add(concert5); concerts.add(concert4);  concerts.add(concert3); concerts.add(concert2); concerts.add(concert1);

        return Arrays.asList(concert1, concert2, concert3, concert4, concert5);
    }
}
