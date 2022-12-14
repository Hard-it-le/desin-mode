package com.design.mode.creation.factory.simpleFactory.actualcombat;

/**
 * @Author yujiale
 * @Date 2022/6/26 17:43
 * @Description TODO
 **/
public class Application {

    private Producer createProduct(String type) {
        return SimpleFactory.createProduct(type);
    }

    public Producer getObject(String type) {
        Producer product = createProduct(type);
        return product;
    }
}
