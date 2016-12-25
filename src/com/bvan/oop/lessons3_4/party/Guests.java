package com.bvan.oop.lessons3_4.party;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class Guests {

    private List<Person> guests = new ArrayList<>();

    public void add(Person person) {
        guests.add(person);
    }

    public void askHowAreGuests() {
        for (Person guest : guests) {
            guest.howAreYou();
        }
    }
}
