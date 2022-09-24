package com.design.mode.structural.proxy.cglib;

import java.lang.reflect.Method;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/15
 */
public class CglibProxy {
    public static <T> T createProxy(T t) {

        //1.创建一个增强器
        Enhancer enhancer = new Enhancer();
        //2。设置要增强那个个类，增强器为这个类动态创建一个子类
        enhancer.setSuperclass(t.getClass());
        //3。设置方法的回调
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object obj,
                                    Method method,
                                    Object[] args,
                                    MethodProxy proxy) throws Throwable {
                //方法拦截的逻辑
                System.out.println("cglib开始了");
                //目标方法进行执行
                Object invoke = proxy.invokeSuper(obj, args);
                return invoke;
            }
        });
        //4。
        Object o = enhancer.create();
        return (T) o;

    }
}
