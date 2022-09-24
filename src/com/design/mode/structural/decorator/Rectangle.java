package com.design.mode.structural.decorator;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/14
 */
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
