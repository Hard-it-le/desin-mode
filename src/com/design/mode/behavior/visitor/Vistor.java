package com.design.mode.behavior.visitor;

/**

 *
 * 接口
 */
public interface Vistor {
    void visitDisk(Disk disk);

    void visitCpu(Cpu cpu);
}
