package com.design.mode.creation.singleton.hungry;

/**
 * @author 余嘉乐
 * @date 2022/09/19
 *  * 饿汉模式
 *  * 类加载的初始化阶段就完成了实例的初始化.本质上就是借助于jvm类加载机制,保证实例的唯一性.
 *  * <p>
 *  * 类加载过程：
 *  * 1、加载二进制数据到内存中，生成对应的 Class 数据结构
 *  * 2、连接；a、验证，b、准备（给类的静态成员变量赋默认值），c、解析
 *  * 3、初始化：给类的静态变量赋初值
 *  * <p>
 *  * jvm能保证以上三步操作只完成一次
 *  * <p>
 *  * 注意：只有在真正使用对应的类时，才会触发初始化（当前类是启动类即main 所在类，直接进行 new 操作、访问静态属性、访问静态方法、用反射访问类等情况
 *
 *
 * 在类加载的时候，Instance 静态实例已经创建并初始化好， 所以 instance 实例的创建过程是线程安全。但是，不支持延迟加载
 *  * 饿汉式优点
 *      *  执行效率高
 *      *  性能高，没有添加任何锁机制
 *      *  饿汉式是在启动的时候就初始化实例，可以更早的发现问题，避免在使用的过程中再去初始化导致的性能问题
 *  *  饿汉式缺点
 *      *  某些情况下内存浪费
 *      *  线程不安全，无法在多线程场景使用
 *      *  仅限于少量的类可以使用，如果类很多就不适合使用
 **/
public class HungrySingleton {

    private static final HungrySingleton INSTANCE = new HungrySingleton();

    private String a;

    public HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return INSTANCE;
    }
}