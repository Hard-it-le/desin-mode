package com.design.mode.behavior.state;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/16
 */
public class MatchState  implements  TeamState{
    @Override
    public void playGame() {
        System.out.println("全力以赴打比赛。。。");
    }

    @Override
    public TeamState next() {
        System.out.println("拉垮状态。。。");
        return new PullDownState();
    }
}
