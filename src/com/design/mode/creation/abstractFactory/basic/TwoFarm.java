package com.design.mode.creation.abstractFactory.basic;

/**

 */
public class TwoFarm implements Farm {
    @Override
    public Animal newAnimal() {
        return new Cattle();
    }

    @Override
    public Plant newPlant() {
        return new Grass();
    }
}
