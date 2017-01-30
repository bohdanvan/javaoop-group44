package com.bvan.oop.lessons9_10.io.user_full_procedural_impl;

import java.util.Random;

/**
 * @author bvanchuhov
 */
public class IdGenerator {

    private static Random random = new Random();

    public static long generateId() {
        return random.nextLong();
    }
}
