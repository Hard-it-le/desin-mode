package com.design.mode.behavior.visitor;

/**

 */
public class Cpu  extends  HardWare{
    public Cpu(String command) {
        super(command);
    }
    @Override
    public void accept(Vistor vistor) {
        vistor.visitCpu(this);
    }

    @Override
    public void work() {
        System.out.println("CPU处理指令"+command);
    }
}
