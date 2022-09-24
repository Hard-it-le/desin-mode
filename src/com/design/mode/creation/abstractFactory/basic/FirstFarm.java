package com.design.mode.creation.abstractFactory.basic;

/**

 */
public class FirstFarm implements Farm {
    @Override
    public Animal newAnimal() {
        return new Dog();
    }

    @Override
    public Plant newPlant() {
        return new Flowers();
    }
}
