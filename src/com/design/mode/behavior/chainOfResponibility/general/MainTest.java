package com.design.mode.behavior.chainOfResponibility.general;

/**

 */
public class MainTest {

    public static void main(String[] args) {
        //组装责任链
        ProjectHeadHandler projectHeadHandler = new ProjectHeadHandler();
        DepartmentHeadHandler departmentHeadHandler = new DepartmentHeadHandler();
        projectHeadHandler.setNext(departmentHeadHandler);
        //提交请求

        projectHeadHandler.handleRequest(6);


    }
}
