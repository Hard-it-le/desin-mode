package com.design.mode.structural.bridge.general;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2022/02/06
 */
public abstract class Abstraction {

    protected IImplementor mImplementor;

    public Abstraction(IImplementor implementor) {
        this.mImplementor = implementor;
    }

    public void operation() {
        this.mImplementor.operationImpl();
    }
}
