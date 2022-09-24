package com.design.mode.behavior.state;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/16
 */
public class Team {

    private TeamState teamState;

    public void setTeamState(TeamState teamState) {
        this.teamState = teamState;
    }

    public void startGame() {
        //状态不同会导致不同的游戏结果
        teamState.playGame();

    }

    void nextState() {
        teamState = teamState.next();
    }

}
