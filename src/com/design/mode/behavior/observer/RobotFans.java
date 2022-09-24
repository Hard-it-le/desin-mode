package com.design.mode.behavior.observer;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/16
 */
public class RobotFans  extends  AbstractFans{
    @Override
    void acceptMsg(String msg) {
        System.out.println("sss");
    }
}
