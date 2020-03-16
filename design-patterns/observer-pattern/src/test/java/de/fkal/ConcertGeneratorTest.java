package de.fkal;


import de.fkal.model.Concert;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ConcertGeneratorTest {

    private ConcertDataGenerator concertDataGenerator;

    @Test
    public void when_callGetConcertData__then_sizeListShouldBe5 () {

        List<Concert> concerts = concertDataGenerator.getConcertData();

        Assert.assertNotNull(concerts);
        Assert.assertEquals(5, concerts.size());
    }

    @Test
    public void when_CallGenerateConcert_then_receiveOneConcert () {
        Concert concert = concertDataGenerator.generateConcert();

        Assert.assertNull(concert);
    }
}
