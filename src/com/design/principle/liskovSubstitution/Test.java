package com.design.principle.liskovSubstitution;

/**

 */
public class Test {

    public static void resize(Rectangle rectangle) {
        while (rectangle.getWidth() >= rectangle.getHeight()) {
            rectangle.setHeight(rectangle.getHeight() + 1);
            System.out.println("Width:" + rectangle.getWidth() + ",Height:" + rectangle.getHeight());
        }
        System.out.println("Resize End,Width:" + rectangle.getWidth() + ",Height:" + rectangle.getHeight());
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(20);
        rectangle.setHeight(10);
        resize(rectangle);
    }
}
