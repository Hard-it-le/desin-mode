package com.design.principle.simpleResponsibility.example.old;

import java.sql.Connection;
import java.sql.ResultSet;

/**
 * @date 2022/10/29
 **/
public class Login {
    public String login(String username,String password){
        Boolean bo = validate(username,password);
        Object user = findUser(username, password);
        if(user==null){
            return "登录失败";
        }
        return "SUCCESS";
    }

    //②参数校验
    public Boolean validate(String username,String password){
        return true;
    }

    //③查找用户信息
    public Object findUser(String username,String password){
        return null;
    }

    //④链接数据库
    public Connection getConn(){
        return null;
    }

    //⑤操作数据库
    public ResultSet query(){
        return null;
    }

}