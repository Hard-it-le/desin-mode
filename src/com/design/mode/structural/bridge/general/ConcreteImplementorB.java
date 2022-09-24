package com.design.mode.structural.bridge.general;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2022/02/06
 *
 * 具体实现B
 */
public class ConcreteImplementorB implements IImplementor {

    @Override
    public void operationImpl() {
        System.out.println("I'm ConcreteImplementor B");
    }
}
