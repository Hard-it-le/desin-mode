package com.design.mode.structural.adapter.classAdapter;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2022/02/04
 */
public class MainTest {
    public static void main(String[] args) {
        Target adapter = new Adapter();
        int result = adapter.request();
        System.out.println(result);
    }
}
