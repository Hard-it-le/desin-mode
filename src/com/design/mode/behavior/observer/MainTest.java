package com.design.mode.behavior.observer;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/16
 */
public class MainTest {
    public static void main(String[] args) {
        MmTikTok mmTikTok = new MmTikTok();
        mmTikTok.startSell();

        RobotFans robotFans = new RobotFans();
        RobotFans robotFans1 = new RobotFans();
        RobotFans robotFans2 = new RobotFans();
        RobotFans robotFans3 = new RobotFans();
        RobotFans robotFans4 = new RobotFans();
        robotFans.follow(mmTikTok);
        robotFans1.follow(mmTikTok);
        robotFans2.follow(mmTikTok);
        robotFans3.follow(mmTikTok);
        robotFans4.follow(mmTikTok);
        HumanFans humanFans = new HumanFans();
        humanFans.follow(mmTikTok);

        System.out.println("=====>");
        mmTikTok.endSell();
    }
}
