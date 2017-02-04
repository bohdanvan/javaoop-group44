package com.bvan.oop.lessons11_12.multithreading.creation;

import com.bvan.oop.lessons11_12.multithreading.ThreadUtils;

/**
 * @author bvanchuhov
 */
public class AnonymousClassCreationSample {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                ThreadUtils.println("Hello");
            }
        }).start();

        ThreadUtils.println("Goodbye");
    }
}
