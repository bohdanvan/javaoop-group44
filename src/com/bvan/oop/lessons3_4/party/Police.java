package com.bvan.oop.lessons3_4.party;

/**
 * @author bvanchuhov
 */
public class Police implements Person, Shooter {

    @Override
    public void howAreYou() {
        System.out.println("Where is your beer? Give me one!");
    }

    @Override
    public void shoot() {
        System.out.println("Bang-bang");
    }
}
