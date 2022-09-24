package com.design.mode.structural.flyweight;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/15
 *
 * 享元和原型的区别
 * 原型是返回的是克隆对象
 * 享元是返回的是本对象
 */
public class MainTest {
    public static void main(String[] args) {

        AbstractWaitressFlyWeight waitress = FlyWeightFactory.getWaitress("");
        waitress.service();
        System.out.println(waitress);
        AbstractWaitressFlyWeight waitress1 = FlyWeightFactory.getWaitress("");
        waitress1.service();
        System.out.println(waitress1);
        waitress1.end();
        AbstractWaitressFlyWeight waitress2 = FlyWeightFactory.getWaitress("");
        waitress2.service();
        System.out.println(waitress2);
    }
}
