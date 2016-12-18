package com.bvan.oop.lessons1_2.dynamic_input.oop;

import java.util.Arrays;
import java.util.StringJoiner;

/**
 * @author bvanchuhov
 */
public class DynamicArray {

    private static final int GROWTH_FACTOR = 2;

    private int[] array = new int[10];
    private int size = 0;

    public void add(int n) {
        if (size == array.length) {
            array = Arrays.copyOf(array, array.length * GROWTH_FACTOR);
        }
        array[size++] = n;
    }

    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "[", "]");
        for (int i = 0; i < size; i++) {
            String s = String.valueOf(array[i]);
            joiner.add(s);
        }
        return joiner.toString();

    }
}
