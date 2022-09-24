package com.design.mode.behavior.strategy;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/16
 */
public class Team {

    /**
     * 抽取游戏策略算法，并进行引用
     */
    private GameStrategy gameStrategy;

    public void setGameStrategy(GameStrategy gameStrategy) {
        this.gameStrategy = gameStrategy;
    }

    public void startGame() {
        System.out.println("游戏开始");
        //游戏策略

        gameStrategy.warStrategy();
        System.out.println("win");
    }
}
