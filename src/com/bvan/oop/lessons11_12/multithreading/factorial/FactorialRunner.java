package com.bvan.oop.lessons11_12.multithreading.factorial;

import com.bvan.oop.lessons11_12.multithreading.ThreadUtils;

import java.util.concurrent.TimeUnit;

/**
 * @author bvanchuhov
 */
public class FactorialRunner {

    public static void main(String[] args) {
        Thread thread = new Thread(new FactorialTask(1_000_000));
        thread.start();

        ThreadUtils.sleep(TimeUnit.SECONDS.toMillis(3));

        thread.interrupt();

        ThreadUtils.println("Main is finished");
    }
}
