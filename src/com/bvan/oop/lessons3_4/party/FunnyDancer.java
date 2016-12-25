package com.bvan.oop.lessons3_4.party;

/**
 * @author bvanchuhov
 */
public class FunnyDancer implements Person, Dancer {

    @Override
    public void howAreYou() {
        System.out.println("Honey-bunny, where is my beer?");
    }

    @Override
    public void dance() {
        System.out.println("Funny dance");
    }
}
