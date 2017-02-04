package com.bvan.oop.lessons11_12.multithreading.creation;

import com.bvan.oop.lessons11_12.multithreading.ThreadUtils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author bvanchuhov
 */
public class ExecutorServiceSample {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int drinker = 0; drinker < 3; drinker++) {
            executorService.submit(new Drinker());
        }
        executorService.shutdown();

        ThreadUtils.println("Goodbye is close");
    }
}
