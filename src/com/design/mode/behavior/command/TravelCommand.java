package com.design.mode.behavior.command;

/**

 */
public class TravelCommand implements  Command{
    private   Receiver receiver =new Receiver();
    @Override
    public void execute() {
        System.out.println("出去旅游了");
        receiver.travel();
    }
}
