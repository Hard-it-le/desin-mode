package com.design.mode.creation.builder.basic;

/**
 */
public class ConcreteBuilder extends Builder {
    private final Product product = new Product();

    @Override
    public Product getProduct() {
        return product;
    }

    @Override
    public void setPart(String arg1, String arg2) {
        product.setName(arg1);
        product.setType(arg2);
    }
}
