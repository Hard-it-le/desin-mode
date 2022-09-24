package com.design.mode.structural.bridge;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/11
 * 抽象渠道
 */
public abstract class AbstractSale {

    private String type;
    private Integer price;

    public AbstractSale(String type, Integer price) {
        this.type = type;
        this.price = price;
    }

    String getSaleInfo() {
        return "渠道：" + type + "===》价格：" + price;
    }
}


