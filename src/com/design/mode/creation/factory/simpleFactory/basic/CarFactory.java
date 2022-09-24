package com.design.mode.creation.factory.simpleFactory.basic;

/**
 */
public class CarFactory {


    public ICar newCar(String type) {

        if ("min" == type) {
            return new MinCar();
        } else if ("max" == type) {
            return new MaxCar();
        } else {
            return new MediumCar();
        }

    }
}
