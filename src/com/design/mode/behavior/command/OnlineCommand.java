package com.design.mode.behavior.command;

/**

 */
public class OnlineCommand implements Command {

   private   Receiver receiver =new Receiver();
    @Override
    public void execute() {
        System.out.println("上课了");
        receiver.online();
    }
}
