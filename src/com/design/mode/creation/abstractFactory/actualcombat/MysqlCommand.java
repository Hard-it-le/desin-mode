package com.design.mode.creation.abstractFactory.actualcombat;

/**
 * @Author yujiale
 * @Date 2022/6/26 20:26
 * @Description TODO
 **/
public class MysqlCommand implements ICommand{

    @Override
    public void command() {
        System.out.println("mysql command...");
    }

}