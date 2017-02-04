package com.bvan.oop.lessons11_12.multithreading.factorial;

import com.bvan.oop.lessons11_12.multithreading.ThreadUtils;

import java.math.BigInteger;
import java.util.concurrent.TimeUnit;

/**
 * n! = 1 * 2 * 3 * ... * n, n >= 0
 * 3! = 6
 * 0! = 1
 *
 * @author bvanchuhov
 */
public class FactorialTask implements Runnable {

    private int n;

    public FactorialTask(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("negative n: " + n);
        }
        this.n = n;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(TimeUnit.SECONDS.toMillis(1));
        } catch (InterruptedException e) {
            lastAction();
            return;
        }

        BigInteger res = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            res = res.multiply(BigInteger.valueOf(i));

            if (i % 10_000 == 0) {
                ThreadUtils.println("Step " + i);

                if (Thread.interrupted()) {
                    lastAction();
                    return;
                }
            }
        }
        ThreadUtils.println("res = " + res);
    }

    private void lastAction() {
        ThreadUtils.println("Hasta la vista");
    }
}
