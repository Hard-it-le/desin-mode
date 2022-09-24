package com.design.mode.structural.proxy.statics;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/15
 * <p>
 * 代理一般都和被代理对象属于同一个接口
 */
public class TikTokProxy implements ISubject {

    /**
     * 被代理对象
     */
    private ISubject subject;

    public TikTokProxy(ISubject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        before();
        subject.request();
        after();
    }

    private void after() {
        System.out.println("after增强");
    }

    private void before() {
        System.out.println("before增强");
    }

}
