package com.bvan.oop.lessons3_4.party;

/**
 * @author bvanchuhov
 */
public class SimplePerson implements Person {

    private final String name;

    public SimplePerson() {
        this("unnamed");
    }

    public SimplePerson(String name) {
        this.name = name;
    }

    public void howAreYou() {
        System.out.println("I'm fine, I'm " + name);
    }

    protected String getName() {
        return name;
    }
}
