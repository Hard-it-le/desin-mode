package com.design.mode.creation.singleton.innerClassSingleton;

/**
 * @author 余嘉乐
 * @date 2022/09/19
 *
 *  * 静态内部类实现单例模式
 *  *  本质上是利用类的加载机制来保证线程安全
 *  *  只有在实际使用的时候，才会触发类的初始化，本质上也是一种懒加载的一种形式
 *  *
 *  *  饿汉模式和静态内部类可以通过判断单例是否存在来防止反射攻击
 **/
public class InnerClassSingleton {
    private static class InnerClassSingletonHolder {
        private static final InnerClassSingleton INSTANCE = new InnerClassSingleton();
    }
    private InnerClassSingleton() {

        if (InnerClassSingletonHolder.INSTANCE == null) {
            throw new RuntimeException("单例不允许多个示例");
        }
    }
    public static InnerClassSingleton getInstance() {
        return InnerClassSingletonHolder.INSTANCE;
    }

}
