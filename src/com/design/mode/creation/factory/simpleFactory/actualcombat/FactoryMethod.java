package com.design.mode.creation.factory.simpleFactory.actualcombat;

/**
 * @Author yujiale
 * @Date 2022/6/26 17:54
 * @Description TODO
 **/
public class FactoryMethod {
    public static void main(String[] args) {
        Application application = new Application();
        Producer object = application.getObject("0");
        object.method();
    }
}
