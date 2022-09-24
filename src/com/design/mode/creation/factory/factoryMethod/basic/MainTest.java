package com.design.mode.creation.factory.factoryMethod.basic;

/**

 */
public class MainTest {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        ITravel car = carFactory.newTravel();
        car.go();

    }
}
