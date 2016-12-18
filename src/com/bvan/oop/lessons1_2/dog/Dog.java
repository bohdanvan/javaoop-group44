package com.bvan.oop.lessons1_2.dog;

/**
 * @author bvanchuhov
 */
public class Dog {

    private final String name;

    public Dog(String name) {
        this.name = name;
    }

    public Dog() {
        this("homeless");
    }

    public void bark() {
        System.out.println("Gav-gav from " + name);
    }

    public void bark(int barksCount) {
        checkBarksCount(barksCount);
        for (int i = 0; i < barksCount; i++) {
            bark();
        }
    }

    private void checkBarksCount(int barksCount) {
        if (barksCount < 0) {
            throw new IllegalArgumentException("negative barks count: " + barksCount);
        }
    }
}
