package com.bvan.oop.lessons7_8.generics.box.good;

import com.bvan.oop.lessons7_8.generics.box.Cat;

/**
 * @author bvanchuhov
 */
public class GenericBoxRunner {

    public static void main(String[] args) {
        Box<Cat> catBox = new Box<>(new Cat());
        sendBox(catBox);
    }

    private static void sendBox(Box<Cat> catBox) {
        Cat cat = catBox.get();
        cat.meow();
    }
}
