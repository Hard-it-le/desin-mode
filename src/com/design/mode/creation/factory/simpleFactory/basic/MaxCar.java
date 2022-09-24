package com.design.mode.creation.factory.simpleFactory.basic;

/**

 */
public class MaxCar implements ICar {
    private String engine;

    public MaxCar() {
        this.engine = "大型轿车";
    }

    @Override
    public void run() {
        System.out.println("这个是" + engine);
    }
}
