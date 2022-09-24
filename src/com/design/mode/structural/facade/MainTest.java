package com.design.mode.structural.facade;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/15
 */
public class MainTest {
    public static void main(String[] args) {
        ReceptionCenter receptionCenter = new ReceptionCenter();
        receptionCenter.handleTest("测试");
    }
}
