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
 *
 *  InnerClassSingletonHolder是一个静态内部类，当外部类 InnererClassSingleton 被创建的时候，并不会创建 Holder 实例对象。
 * 只有当调用 getInstance 方法时，Holder 才会被加载，这时候才会创建Instance。
 * Instace的唯一性、创建过程的线程安全性都由 JVM 来保证，所以这种方法即保证线程安全，也实现了延迟加载。
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
