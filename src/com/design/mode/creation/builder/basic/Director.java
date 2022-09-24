package com.design.mode.creation.builder.basic;

/**
 */
public class Director {
    private final AbstractBuilder builder = new ConcreteBuilder();

    public Product getAProduct() {
        builder.setPart("宝马汽车", "X7");
        return builder.getProduct();
    }

    public Product getBProduct() {
        builder.setPart("奥迪汽车", "Q5");
        return builder.getProduct();
    }
}
