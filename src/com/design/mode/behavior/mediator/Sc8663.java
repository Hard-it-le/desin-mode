package com.design.mode.behavior.mediator;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/16
 */
public class Sc8663  extends Captain{

    ControlTower controlTower;

    public void setControlTower(ControlTower controlTower) {
        this.controlTower = controlTower;
    }
    @Override
    void fly() {
        System.out.println("sc请求起飞");
        controlTower.acceptRequest(this,"fly");
    }

    @Override
    void land() {
        System.out.println("sc请求降落");
        controlTower.acceptRequest(this,"land");
    }

    @Override
    void success() {
        System.out.println("sc请求完成");
        controlTower.acceptRequest(this,"success");
    }
}
