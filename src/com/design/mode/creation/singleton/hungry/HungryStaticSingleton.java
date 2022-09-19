package com.design.mode.creation.singleton.hungry;

/**
 * @author 余嘉乐
 * @date 2022/09/19
 **/
public class HungryStaticSingleton {

    //先静态后动态
    //先上后下
    //先属性后方法


    private static final HungryStaticSingleton STATIC_SINGLETON;

    private String b;

    static {
        STATIC_SINGLETON = new HungryStaticSingleton();
    }

    private HungryStaticSingleton() {

    }

    public static HungryStaticSingleton getInstance() {
        return STATIC_SINGLETON;
    }
}