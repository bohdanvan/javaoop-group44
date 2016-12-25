package com.bvan.oop.lessons3_4.shape;

import java.util.ArrayList;

/**
 * @author bvanchuhov
 */
public class Shapes {

    private ArrayList<Shape> shapes = new ArrayList<>();

    public void add(Shape shape) {
        shapes.add(shape);
    }

    public double getArea() {
        double area = 0;
        for (Shape shape : shapes) {
            area += shape.getArea();
        }
        return area;
    }
}
