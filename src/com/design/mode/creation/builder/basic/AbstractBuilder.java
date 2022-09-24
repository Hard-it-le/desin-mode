package com.design.mode.creation.builder.basic;

/**
 *
 * 建造者模式
 */
public abstract class AbstractBuilder {

    public abstract void setPart(String arg1, String arg2);

    public abstract Product getProduct();
}