package com.design.mode.creation.abstractFactory.basic;

/**

 */
public class MainTest {
    public static void main(String[] args) {
        Farm firstFarm = new FirstFarm();

        Animal animal = firstFarm.newAnimal();
        animal.eat();
        Plant plant = firstFarm.newPlant();

        plant.bloom();
        Farm twoFarm = new TwoFarm();

        Animal animal1 = twoFarm.newAnimal();
        animal1.eat();

    }
}
