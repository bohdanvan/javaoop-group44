package com.bvan.oop.lessons3_4.rectangle;

/**
 * @author bvanchuhov
 */
public class Rectangle {

    private final int width;
    private final int height;

    public Rectangle(int width, int height) {
        checkWidth(width);
        checkHeight(height);

        this.width = width;
        this.height = height;
    }

    private void checkHeight(int height) {
        if (height <= 0) {
            throw new IllegalArgumentException("not positive height: " + height);
        }
    }

    private void checkWidth(int width) {
        if (width <= 0) {
            throw new IllegalArgumentException("not positive width: " + width);
        }
    }

    public int getPerimeter() {
        return 2 * (width + height);
    }

    public int getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
