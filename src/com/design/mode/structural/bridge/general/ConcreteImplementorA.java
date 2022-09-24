package com.design.mode.structural.bridge.general;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2022/02/06
 *
 * 具体实现A
 */
public class ConcreteImplementorA implements IImplementor {

    @Override
    public void operationImpl() {
        System.out.println("I'm ConcreteImplementor A");
    }
}
