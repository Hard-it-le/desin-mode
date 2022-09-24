package com.design.mode.structural.adapter.classAdapter;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2022/02/04
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public int request() {
        return super.specificRequest() / 10;
    }
}
