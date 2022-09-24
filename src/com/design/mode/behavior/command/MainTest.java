package com.design.mode.behavior.command;

/**

 */
public class MainTest {
    public static void main(String[] args) {

        Invoker invoker = new Invoker();
        invoker.setCommand(new TravelCommand());
        invoker.call();
    }
}
