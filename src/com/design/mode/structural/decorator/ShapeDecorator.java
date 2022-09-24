package com.design.mode.structural.decorator;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/14
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
