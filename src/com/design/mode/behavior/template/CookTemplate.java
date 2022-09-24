package com.design.mode.behavior.template;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/16
 * 定义模版
 */
public  abstract class CookTemplate {

    /**
     * 定义算法
     * 父类可以实现某些步骤，将关键的核心留个子类
     */
    public void  cook(){
        heating();
        addFood();
        addSalt();
        stirFry();
        end();
    }



    private void  heating(){
        System.out.println("开火。。。");
    }

    public abstract void addFood();

    public abstract void addSalt();

    public void stirFry(){
        System.out.println("翻炒。。。");
    }

    public void end(){
        System.out.println("出锅");
    }
}
