package com.design.mode.creation.singleton.lazy;

/**
 * @author 余嘉乐
 * @date 2022/09/19
 * 双重检查锁，懒加载优化
 * 双重检测即支持延迟加载，也支持高并发的单例实现方式
 * 只要 Instance 被创建后，在调用 getInstance 函数都不会进入到加锁逻辑中，解决了懒汉式并发度低的问题
 *  * 懒汉模式：延迟加载，只有在被使用的时候才会被实例化
 *  * 优点
 *  * - 第一次调用时才初始化,避免内存浪费
 *  * 缺点
 *  * - 必须加锁才能保证单例，而锁的存在于影响运行效率
 **/
public class LazyDoubleCheckSingleton {
    /**
     * volatile 防止编译器和 Cpu 对指令重排，
     * 如果两个线程并发,第一个线程执行了 (指令被重排)1,3步骤时(instance引用赋值了,但并未初始化)此时第二个线程进来,在最外层判空为false,直接返回,此时可能会出现空指针异常.
     */
    private  static volatile LazyDoubleCheckSingleton instance;


    /**
     * 构造器私有，外部不能实例化
     */
    private LazyDoubleCheckSingleton() {
        System.out.println("LazySingleton");
    }


    /**
     * * 懒汉优化方案
     * 线程安全问题：多线程进行访问创建时,可能会出现线程安全问题.(加上Thread.sleep()可以使问题放大),破坏了单例的定义
     * 优化一
     * 在获取对象的方法加上synchronized,能保证单例,但会损耗性能.
     * 优化二
     * 延迟加锁
     *  防止资源浪费,在instance判空后,进行加锁,在instance不为空时,不进行加锁.
     *  由于在判空后进行加锁, 还是可能会出现线程安全问题.
     *  所以在加锁后再进行一次判空在加锁处还是可能会出现线程并发
     */
    public static LazyDoubleCheckSingleton getInstance() {
        //双重加锁机制， 检查是否要阻塞
        if (instance == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                //检查是否要重新创建实例
                if (instance == null) {
                    //指令重排序的问题
                    instance = new LazyDoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}