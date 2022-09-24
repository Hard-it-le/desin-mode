package com.design.mode.behavior.visitor;

/**

 */
public class MainTest {
    public static void main(String[] args) {
        XiaoAl xiaoAl = new XiaoAl();
        xiaoAl.answerQuestion();

        //cpu联网指令、disk保存到云存储

        System.out.println("=======");


        UpdatePackage updatePackage = new UpdatePackage("联网增强");
        xiaoAl.acceptUpdate(updatePackage);
        xiaoAl.answerQuestion();
    }


}
