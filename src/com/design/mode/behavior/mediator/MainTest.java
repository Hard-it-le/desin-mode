package com.design.mode.behavior.mediator;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/16
 */
public class MainTest {
    public static void main(String[] args) {

        ControlTower controlTower = new ControlTower();

        Hu8778 hu8778 = new Hu8778();
        hu8778.setControlTower(controlTower);
        Sc8663 sc8663 = new Sc8663();
        sc8663.setControlTower(controlTower);
        hu8778.fly();
        hu8778.success();
        sc8663.fly();

    }
}
