package com.design.mode.behavior.strategy.general;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2022/02/08
 */
public class MainTest {

    public static void main(String[] args) {
        PayActivity<Integer> integerPayActivity = new PayActivity<Integer>(new WxPayment());
        integerPayActivity.execute();
    }
}
