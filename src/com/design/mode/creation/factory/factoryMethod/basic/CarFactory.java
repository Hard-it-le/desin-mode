package com.design.mode.creation.factory.factoryMethod.basic;

/**

 */
public class CarFactory implements IFactory {
    @Override
    public ITravel newTravel() {
        return new Car();
    }
}
