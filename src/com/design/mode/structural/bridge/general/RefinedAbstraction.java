package com.design.mode.structural.bridge.general;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2022/02/06
 *
 * 修正抽象角色
 */
public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(IImplementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("refined operation");
    }
}
