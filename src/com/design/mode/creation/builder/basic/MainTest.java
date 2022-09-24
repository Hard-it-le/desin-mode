package com.design.mode.creation.builder.basic;

/**
 */
public class MainTest {
    public static void main(String[] args) {
        Director director = new Director();
        Product product1 = director.getAProduct();
        product1.showProduct();
        Product product2 = director.getBProduct();
        product2.showProduct();
    }
}
