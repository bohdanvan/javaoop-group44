package com.bvan.oop.lessons3_4.polymorphism;

/**
 * @author bvanchuhov
 */
public class OverloadingSample {

    public static void main(String[] args) {
        double sum = sum(10.0, 20);
        System.out.println("sum = " + sum);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }
}
