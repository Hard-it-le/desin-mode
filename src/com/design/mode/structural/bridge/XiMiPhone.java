package com.design.mode.structural.bridge;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/11
 */
public class XiMiPhone extends AbstractPhone {
    @Override
    String getPhone() {
        return "小米" + abstractSale.getSaleInfo();
    }
}
