package com.design.principle.dependenceInversion.example.news;

import java.sql.Connection;


public class MySQLUtil {

    //获得MySQL链接
    public Connection getConn(){
        System.out.println("链接MySQL");
        return null;
    }
}
