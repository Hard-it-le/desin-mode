package com.design.mode.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/16
 */
public class MmTikTok extends AbstractTikTok {

    List<AbstractFans> fansList = new ArrayList<>();


    void startSell() {
        System.out.println("开始卖货");
        notifyFans("卖东西了开始了");
    }

    void endSell() {
        System.out.println("结束卖货");
        notifyFans("卖东西了结束了");
    }


    @Override
    void addFans(AbstractFans abstractFans) {
        fansList.add(abstractFans);
    }

    @Override
    void notifyFans(String msg) {
        for (AbstractFans fans : fansList) {
            fans.acceptMsg(msg);

        }
    }
}
