package com.design.mode.behavior.command;

/**

 */
public class Invoker {
    Command command;

    public void call() {
        //命令
        command.execute();
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
