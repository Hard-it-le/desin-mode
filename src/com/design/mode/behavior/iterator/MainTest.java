package com.design.mode.behavior.iterator;

/**

 */
public class MainTest {
    public static void main(String[] args) {
        Test01Man test01Man = new Test01Man();
        test01Man.likeYou("张三");
        test01Man.likeYou("李四");
        test01Man.likeYou("王五");

        AbstractBeautifulMan.Itr iterator = test01Man.getIterator();
        String s = iterator.firstLove();
        System.out.println(s);
        String s1 = iterator.currentLove();
        System.out.println(s1);
        System.out.println("============");
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
