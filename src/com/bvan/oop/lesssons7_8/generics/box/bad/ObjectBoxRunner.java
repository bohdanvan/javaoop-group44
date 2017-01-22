package com.bvan.oop.lesssons7_8.generics.box.bad;

import com.bvan.oop.lesssons7_8.generics.box.Cat;
import com.bvan.oop.lesssons7_8.generics.box.Dog;

/**
 * @author bvanchuhov
 */
public class ObjectBoxRunner {

    public static void main(String[] args) {
        ObjectBox catBox = new ObjectBox(new Dog());
        sendBox(catBox);
    }

    private static void sendBox(ObjectBox catBox) {
        Object value = catBox.get();

        if (value instanceof Cat) {
            Cat cat = (Cat) value;
            cat.meow();
        } else {
            throw new IllegalArgumentException("Where is my cat???");
        }
    }
}
