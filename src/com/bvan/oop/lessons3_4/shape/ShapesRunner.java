package com.bvan.oop.lessons3_4.shape;

/**
 * @author bvanchuhov
 */
public class ShapesRunner {

    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        shapes.add(new Rectangle(10, 20)); // 200
        shapes.add(new Circle(10.)); // 314
        shapes.add(new EquilateralTriangle(10.)); // 43

        System.out.println("sum area = " + shapes.getArea());
    }
}
