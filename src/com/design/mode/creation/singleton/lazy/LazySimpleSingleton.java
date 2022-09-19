package com.design.mode.creation.singleton.lazy;

/**
 * @author 余嘉乐
 * @date 2022/09/19
 *
 * 简易版 懒汉式
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