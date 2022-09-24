package com.design.mode.behavior.state;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/16
 */
public class PullDownState  implements TeamState{
    @Override
    public void playGame() {
        System.out.println("拉垮打游戏");
    }

    @Override
    public TeamState next() {
        System.out.println("旅游状态。。。");
        return new VocationState();
    }
}
