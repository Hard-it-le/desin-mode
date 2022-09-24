package com.design.mode.behavior.mediator;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/16
 * <p>
 * 中介者模式就是把网状的模式变成*状的模式
 */
public class ControlTower {
    private boolean canDo = true;

    public void acceptRequest(Captain captain, String action) {

        if ("fly".equals(action) || "lang".equals(action)) {
            if (canDo) {
                System.out.println("允许");
                canDo = false;
            } else {
                System.out.println("不允许");
            }
        }
        if ("success".equals(action)) {
            canDo = true;
        }

    }
}
