package com.bvan.oop.lessons3_4.shape;

/**
 * @author bvanchuhov
 */
public class CircleRunner {

    public static void main(String[] args) {
        Circle circle = new Circle(10.);
        System.out.println("S = " + circle.getArea()); // 314
        System.out.println("P = " + circle.getPerimeter()); // 62
        System.out.println(circle);
    }
}
