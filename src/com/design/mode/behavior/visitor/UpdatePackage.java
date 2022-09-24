package com.design.mode.behavior.visitor;

/**

 */
public class UpdatePackage implements Vistor {
    private String ex;

    public UpdatePackage(String ex) {
        this.ex = ex;
    }


    @Override
    public void visitDisk(Disk disk) {
        disk.command += "》》》》》 联网云存储";
    }

    @Override
    public void visitCpu(Cpu cpu) {
        cpu.command += "》》》》》 联网查询中";

    }
}
