package com.design.mode.behavior.visitor;

/**

 */
public class XiaoAl {
    private Cpu cpu = new Cpu("武汉天气");
    private Disk disk = new Disk("武汉天气");


    void answerQuestion() {
        cpu.work();
        disk.work();
    }

    public void acceptUpdate(Vistor updatePackage) {


        updatePackage.visitCpu(cpu);
        updatePackage.visitDisk(disk);
    }
}
