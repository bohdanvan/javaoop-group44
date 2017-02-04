package com.bvan.oop.lessons11_12.multithreading.creation;

import java.util.concurrent.TimeUnit;

/**
 * @author bvanchuhov
 */
public class DaemonSample {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Drinker());
        thread.setDaemon(true);
        thread.start();

        TimeUnit.SECONDS.sleep(2);

        System.out.println("Goodbye");
    }
}
