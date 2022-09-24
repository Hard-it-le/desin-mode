package com.design.mode.behavior.template;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/16
 */
public class AutoCookMachine  extends CookTemplate{
    @Override
    public void addFood() {
        System.out.println("白菜");
    }

    @Override
    public void addSalt() {
        System.out.println("盐");
    }
}
