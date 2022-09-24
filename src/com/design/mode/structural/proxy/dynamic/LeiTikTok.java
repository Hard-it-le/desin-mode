package com.design.mode.structural.proxy.dynamic;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/15
 */
public class LeiTikTok implements ManTikTok,SellTikTok {
    @Override
    public void tikTok() {
        System.out.println("tikTok....");
    }

    @Override
    public void sell() {
        System.out.println("sell....");
    }

    public void myMethod(){
        System.out.println("myMethod...");
    }
}
