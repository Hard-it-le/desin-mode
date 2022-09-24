package com.design.mode.creation.factory.simpleFactory.basic;

/**

 */
public class MainTest {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        ICar min = carFactory.newCar("min");
        ICar max = carFactory.newCar("max");
        ICar medium = carFactory.newCar("test");
        min.run();
        System.out.println("=======");
        medium.run();
        System.out.println("=======");
        max.run();
        System.out.println("=======");

    }
}
