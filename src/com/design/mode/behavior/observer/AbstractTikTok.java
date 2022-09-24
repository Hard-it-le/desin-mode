package com.design.mode.behavior.observer;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/16
 */
public abstract class AbstractTikTok {

    abstract  void addFans(AbstractFans abstractFans);

    abstract void notifyFans(String msg);
}
