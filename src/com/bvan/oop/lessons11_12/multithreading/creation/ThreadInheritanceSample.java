package com.bvan.oop.lessons11_12.multithreading.creation;

import com.bvan.oop.lessons11_12.multithreading.ThreadUtils;

/**
 * @author bvanchuhov
 */
public class ThreadInheritanceSample {

    public static void main(String[] args) {
        Thread thread = new MyThread();
        thread.start();

        ThreadUtils.println("Goodbye");
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        ThreadUtils.println("Hello");
    }
}
