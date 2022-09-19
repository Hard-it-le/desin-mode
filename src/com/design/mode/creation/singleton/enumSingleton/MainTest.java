package com.design.mode.creation.singleton.enumSingleton;

/**
 * @author 余嘉乐
 * @date 2022/09/19
 **/
public class MainTest {
    public static void main(String[] args) {
        EnumSingleton instance = EnumSingleton.getInstance();
        instance.setData(new Object());
    }
}