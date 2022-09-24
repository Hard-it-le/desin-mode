package com.design.mode.behavior.observer;

import java.util.List;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/16
 */
public abstract class AbstractFans {

    List<AbstractTikTok> tikToks;

    abstract void acceptMsg(String msg);

    void follow(AbstractTikTok tikTok) {
        tikTok.addFans(this);
        for (AbstractTikTok tok : tikToks) {
            System.out.println(tok);
        }
    }
}
