package com.design.mode.creation.singleton.lazy;

/**
 * @author 余嘉乐
 * @date 2022/09/19
 *
 * 简易版 懒汉式
 * 懒汉式又叫做饱汉式，在使用的时候进行创建并初始化，会造成性能瓶颈问题。但是相对比饿汉式，支持延迟加载
 *  * * 优点：节省了内存,线程安全
 *  * * 缺点：性能低
 **/
public class LazySimpleSingleton {
    private static LazySimpleSingleton instance;

    private LazySimpleSingleton() {
    }

    public synchronized static LazySimpleSingleton getInstance() {
        if (instance == null) {
            instance = new LazySimpleSingleton();
        }
        return instance;
    }
}