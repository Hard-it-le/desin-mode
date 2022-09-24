package com.design.mode.structural.proxy.statics;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/15
 *
 * subject  主体
 */
public class RealSubject implements ISubject {
    @Override
    public void request() {
        System.out.println("人，request......");
    }
}
