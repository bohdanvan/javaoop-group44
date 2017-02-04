package com.bvan.oop.lessons11_12.multithreading.creation;

import com.bvan.oop.lessons11_12.multithreading.ThreadUtils;

/**
 * @author bvanchuhov
 */
public class ThreadMethodsSample {

    public static void main(String[] args) throws InterruptedException {
        Thread drinkerThread = new Thread(new Drinker(), "Hello");
        drinkerThread.start();

        drinkerThread.join();

        ThreadUtils.println("Goodbye is closed");
    }
}
