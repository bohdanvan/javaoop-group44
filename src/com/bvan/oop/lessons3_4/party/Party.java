package com.bvan.oop.lessons3_4.party;

/**
 * @author bvanchuhov
 */
public class Party {

    public static void main(String[] args) {
        Guests guests = new Guests();
        guests.add(new SimplePerson());
        guests.add(new SimpleMentor());
        guests.add(new Waitress());
        guests.add(new Waitress());
        guests.add(new GuyWithBeer());
        guests.add(new FunnyDancer());
        guests.add(new Police());

        guests.askHowAreGuests();
    }
}
