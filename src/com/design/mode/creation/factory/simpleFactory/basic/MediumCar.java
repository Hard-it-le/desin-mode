package com.design.mode.creation.factory.simpleFactory.basic;

/**

 */
public class MediumCar implements ICar {

    private String engine;

    public MediumCar() {
        this.engine = "中等轿车";
    }

    @Override
    public void run() {
        System.out.println("这个是" + engine);
    }
}
