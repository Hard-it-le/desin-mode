package com.design.principle.compositReuse.example.news;


public class OrderService {

    private OrderDao orderDao;
    private LogDao logDao;

    public void add(){
        orderDao.add();
        logDao.recode();
    }
}
