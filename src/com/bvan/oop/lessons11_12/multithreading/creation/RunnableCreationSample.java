package com.bvan.oop.lessons11_12.multithreading.creation;

import com.bvan.oop.lessons11_12.multithreading.ThreadUtils;

/**
 * @author bvanchuhov
 */
public class RunnableCreationSample {

    public static void main(String[] args) {
        new Thread(new Drinker()).start();
        new Thread(new Drinker()).start();
        new Thread(new Drinker()).start();

        ThreadUtils.println("Goodbye");
    }
}

