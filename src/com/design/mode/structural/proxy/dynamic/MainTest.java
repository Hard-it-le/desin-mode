package com.design.mode.structural.proxy.dynamic;

import java.util.Arrays;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/15
 * 动态代理模式
 * <p>
 * 代理对象的和目标对象的相同点在于，都是同一个接口
 * Jdk动态代理必须要求被代理对象要有接口
 *
 * 缺点：被代理类必须要有接口
 *
 * 代理只能转换成为接口类
 */
public class MainTest {
    public static void main(String[] args) {
        ManTikTok leiTikTok = new LeiTikTok();
        /**
         * 动态代理机制
         */
        ManTikTok proxy = JdkTikTokProxy.getProxy(leiTikTok);
        proxy.tikTok();


        ((SellTikTok) proxy).sell();
        System.out.println(Arrays.asList(proxy.getClass().getInterfaces()));
    }
}
