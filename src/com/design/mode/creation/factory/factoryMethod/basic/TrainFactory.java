package com.design.mode.creation.factory.factoryMethod.basic;

/**

 */
public class TrainFactory implements IFactory {
    @Override
    public ITravel newTravel() {
        return new Train();
    }
}
