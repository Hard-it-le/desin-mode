package com.design.principle.simpleResponsibility.example.news;

import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @date 2022/10/29
 **/
public class LoginService {
    @Resource
    private LoginDao loginDao;

    public Object findUser(String username, String password) {
        return loginDao.query();
    }

}