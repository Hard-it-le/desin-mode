package com.design.mode.behavior.strategy.general;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2022/02/08
 */
public class BankPayment implements Payment {
    @Override
    public void getPayType() {
        System.out.println("银行卡支付");
    }
}
