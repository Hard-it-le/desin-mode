package com.design.mode.behavior.strategy.general;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2022/02/08
 * 微信调用支付
 */
public class WxPayment implements Payment {
    @Override
    public void getPayType() {
        System.out.println("微信支付");
    }
}
