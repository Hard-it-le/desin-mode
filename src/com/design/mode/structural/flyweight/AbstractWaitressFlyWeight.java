package com.design.mode.structural.flyweight;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/15
 */
public abstract class AbstractWaitressFlyWeight {
    //能否服务
    boolean canServices = true;

    /**
     * 正在服务  享元的不可共享属性留给外部进行改变的接口
     */
    abstract void service();

    /**
     * 服务完成   享元的不可共享属性留给外部进行改变的接口
     */
    abstract void end();

    public boolean isCanService() {
        return canServices;
    }
}
