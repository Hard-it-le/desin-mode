package com.design.mode.creation.singleton.lazy;

import java.lang.reflect.Constructor;

/**
 * @author 余嘉乐
 * @date 2022/09/19
 *
 * 反射破坏单例
 **/
public class ReflectDestructionTest {

    public static void main(String[] args) {
        try {
            //定义反射
            Class<?> clazz = LazySimpleSingleton.class;
            //通过反射获取私有的构造方法
            Constructor<?> clazzDeclaredConstructor = clazz.getDeclaredConstructor();
            //强制访问
            clazzDeclaredConstructor.setAccessible(true);
            //暴力初始化并进行对比
            Object instance1 = clazzDeclaredConstructor.newInstance();
            Object instance2 = clazzDeclaredConstructor.newInstance();
            System.out.println(instance1);
            System.out.println(instance2);
            System.out.println(instance1 == instance2);
            System.out.println(clazzDeclaredConstructor);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

