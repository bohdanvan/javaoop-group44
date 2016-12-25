package com.bvan.oop.lessons3_4.party;

/**
 * @author bvanchuhov
 */
public class SimpleMentor extends SimplePerson implements Mentor {

    public SimpleMentor() {
        super();
    }

    public SimpleMentor(String name) {
        super(name);
    }

    @Override
    public void howAreYou() {
        System.out.print("Thanks, I'm OK. I'm " + getName());
        teach();
    }

    public void teach() {
        System.out.println("MAKE HOME WORK!!!");
    }
}
