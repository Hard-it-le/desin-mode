package com.design.mode.creation.factory.factoryMethod.basic;

/**

 */
public class AircraftFactory implements IFactory {

    @Override
    public ITravel newTravel() {
        return new Aircraft();
    }
}
