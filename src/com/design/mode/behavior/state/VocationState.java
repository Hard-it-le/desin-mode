package com.design.mode.behavior.state;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/16
 */
public class VocationState implements TeamState{
    @Override
    public void playGame() {
        System.out.println("旅游状态。。。。");
    }

    @Override
    public TeamState next() {
        System.out.println("竞赛状态。。。");
        return new MatchState();
    }
}
