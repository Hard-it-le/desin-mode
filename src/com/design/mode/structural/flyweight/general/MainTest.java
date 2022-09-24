package com.design.mode.structural.flyweight.general;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2022/01/29
 */
public class MainTest {
    public static void main(String[] args) {
        IFlyweight flyweight1 = FlyweightFactory.getFlyweight("aa");
        IFlyweight flyweight2 = FlyweightFactory.getFlyweight("bb");
        flyweight1.operation("a");
        flyweight2.operation("b");
    }
}
