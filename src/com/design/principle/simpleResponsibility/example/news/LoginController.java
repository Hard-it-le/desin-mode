package com.design.principle.simpleResponsibility.example.news;

import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @date 2022/10/29
 **/
public class LoginController {


    @Resource
    private LoginService loginService;

    //①登录，用户请求该方法
    public String login(String username,String password){
        Boolean bo = validate(username,password);
        Object user = loginService.findUser(username, password);
        if(user==null){
            return "登录失败";
        }
        return "SUCCESS";
    }


    //②参数校验
    public Boolean validate(String username,String password){
        return true;
    }

}