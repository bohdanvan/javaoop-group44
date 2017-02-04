package com.bvan.oop.lessons11_12.multithreading.creation;

import com.bvan.oop.lessons11_12.multithreading.ThreadUtils;

import java.util.concurrent.TimeUnit;

/**
 * @author bvanchuhov
 */
public class Drinker implements Runnable {

    private static int nextId = 0;

    private final int id = nextId++;

    @Override
    public void run() {
        ThreadUtils.println(helloMessage() + "I'm starting...");
        for (int beer = 0; beer < 5; beer++) {
            ThreadUtils.println(helloMessage() + "I'm drinking " + beer + " beer");

            ThreadUtils.sleep(TimeUnit.SECONDS.toMillis(1));
        }
        ThreadUtils.println(helloMessage() + "I have finished");
    }

    private String helloMessage() {
        return "I'm " + id + " drinker. ";
    }
}
