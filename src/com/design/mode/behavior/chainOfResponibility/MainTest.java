package com.design.mode.behavior.chainOfResponibility;

/**

 *
 * 链条的引用点
 * 下一个继续
 * 构造链条
 * 回旋责任链
 * 1-- 2-- 3-- 本人-- 3-- 2-- 1
 */
public class MainTest {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("老师1");
        Teacher teacher1 = new Teacher("老师2");
        Teacher teacher2 = new Teacher("老师3");

        //构造链条

        teacher.setNext(teacher1);
        teacher1.setNext(teacher2);
        teacher.handleRequest();

    }
}
