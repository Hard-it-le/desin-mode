package com.design.mode.behavior.strategy.general;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2022/02/08
 */
public class AlipayPayment implements Payment{
    @Override
    public void getPayType() {
        System.out.println("支付宝支付");
    }
}
