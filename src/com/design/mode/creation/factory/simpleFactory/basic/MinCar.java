package com.design.mode.creation.factory.simpleFactory.basic;

/**

 */
public class MinCar implements ICar {

    private String engine;


    public MinCar() {
        this.engine = "小型汽车";
    }


    @Override
    public void run() {
        System.out.println("这个是" + engine);
    }
}
