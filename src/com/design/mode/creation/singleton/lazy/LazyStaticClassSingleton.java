package com.design.mode.creation.singleton.lazy;

/**
 * @author 余嘉乐
 * @date 2022/09/19
 **/
public class LazyStaticClassSingleton {
    private LazyStaticClassSingleton() {
        if (null !=   LazyHolder.INSTANCE){
            throw new RuntimeException("违反了单例模式");
        }
    }

    private static LazyStaticClassSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }


    private static class LazyHolder {
        private static final LazyStaticClassSingleton INSTANCE = new LazyStaticClassSingleton();
    }
}