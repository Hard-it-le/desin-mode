package com.design.principle.simpleResponsibility.example.news;

import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @date 2022/10/29
 **/
public class LoginDao {

    @Resource
    private DBUtil dbUtil;

    //查询数据库
    public Object query() {
        return dbUtil.getConn();
    }
}
