package com.design.mode.creation.abstractFactory.actualcombat;

/**
 * @Author yujiale
 * @Date 2022/6/26 20:25
 * @Description TODO
 **/
public class MysqlConnection implements IConnection{

    @Override
    public void connect() {
        System.out.println("mysql connection...");
    }
}
