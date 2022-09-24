package com.design.mode.behavior.visitor;

/**

 * 抽象元素
 */
public abstract class HardWare {
    String command;


    public HardWare(String command) {
        this.command = command;

    }

    public void work(){
        System.out.println(command);
    }

    /**
     * 定义接收软件升级包的方法，这个方法应该具体硬件去实现
     * @param vistor
     */
    public abstract void  accept(Vistor vistor);
}
