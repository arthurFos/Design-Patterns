package de.fkal.model;

import de.fkal.observer.Observer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.time.ZonedDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class Concert {

    private String name;
    private String type;
    private String country;
    private String city;
    private ZonedDateTime dateAndTime;

    public String toString(Observer observer) {
        return observer.getClass().getSimpleName() + " receives alert to concert: \n Name -> " +
                this.name+ "\n Type -> " +this.type+ "\n country: " +this.country+ " in City: " + this.city;
    }
}
