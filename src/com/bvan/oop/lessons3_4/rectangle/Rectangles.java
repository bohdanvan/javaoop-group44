package com.bvan.oop.lessons3_4.rectangle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;

/**
 * @author bvanchuhov
 */
public class Rectangles {

    private final List<Rectangle> rectangles = new ArrayList<>();

    public void add(Rectangle rectangle) {
        rectangles.add(rectangle);
    }

    public int getArea() {
        int area = 0;
        for (Rectangle rectangle : rectangles) {
            area += rectangle.getArea();
        }
        return area;
    }

    public List<Rectangle> getAll() {
        return rectangles;
    }

    public List<Rectangle> toList() {
        return Collections.unmodifiableList(rectangles);
    }

    @Override
    public String toString() {
        StringJoiner stringJoiner = new StringJoiner("\n");
        for (Rectangle rectangle : rectangles) {
            stringJoiner.add(rectangle.toString());
        }
        return "Rectangles:\n" + stringJoiner.toString();
    }
}
