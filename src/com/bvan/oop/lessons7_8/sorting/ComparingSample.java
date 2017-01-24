package com.bvan.oop.lessons7_8.sorting;

/**
 * @author bvanchuhov
 */
public class ComparingSample {

    public static void main(String[] args) {
        System.out.println("Int:");
        System.out.println(Integer.compare(10, 20)); // < 0
        System.out.println(Integer.compare(20, 20)); // 0
        System.out.println(Integer.compare(30, 20)); // > 0
        System.out.println();

        System.out.println("String:");
        System.out.println("ABCD".compareTo("XYZ")); // < 0
        System.out.println("Home".compareTo("Homework")); // < 0
        System.out.println("Home".compareTo("Home")); // 0
    }
}
