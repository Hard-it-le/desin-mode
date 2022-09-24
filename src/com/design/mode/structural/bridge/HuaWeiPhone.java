package com.design.mode.structural.bridge;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/11
 */
public class HuaWeiPhone  extends AbstractPhone{
    @Override
    String getPhone() {
        return "华为"+abstractSale.getSaleInfo();
    }
}
