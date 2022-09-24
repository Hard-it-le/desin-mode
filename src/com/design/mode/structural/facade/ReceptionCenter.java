package com.design.mode.structural.facade;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/15
 */
public class ReceptionCenter {

    Edu edu = new Edu();

    Police police = new Police();

    Social social=new Social();

    /**
     * 总方法
     */
    public void handleTest(String name){
        edu.school(name);
        police.register(name);
        social.handleSocial(name);
    }
}
