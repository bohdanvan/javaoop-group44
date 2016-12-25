package com.bvan.oop.lessons3_4.rectangle;

/**
 * @author bvanchuhov
 */
public class RectangleRunner {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println("P = " + rectangle.getPerimeter());
        System.out.println("S = " + rectangle.getArea());
        System.out.println(rectangle);

        Rectangles rectangles = new Rectangles();
        rectangles.add(new Rectangle(10, 10)); // 100
        rectangles.add(new Rectangle(1, 1)); // 1
        rectangles.add(new Rectangle(2, 5)); // 10
        rectangles.add(rectangle); // 200

        int area = rectangles.getArea();
        System.out.println("rectangles area = " + area);

        System.out.println(rectangles);
    }
}
