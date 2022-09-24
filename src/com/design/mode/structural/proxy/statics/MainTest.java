package com.design.mode.structural.proxy.statics;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/14
 * 静态代理就是装饰器模式
 * 装饰器模式是代理模式的一种
 *
 * 静态代理缺点 ：代理的东西不一样，每一种不同的被代理类都要不同的静态代理类
 */
public class MainTest {
    public static void main(String[] args) {
        TikTokProxy tikTokProxy = new TikTokProxy(new RealSubject());
        tikTokProxy.request();
    }
}
