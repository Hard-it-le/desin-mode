package com.design.principle.compositReuse.example.news;


public class UserService {

    private UserDao userDao;
    private LogDao logDao;

    public void modify(){
        userDao.modify();
        logDao.recode();
    }
}
