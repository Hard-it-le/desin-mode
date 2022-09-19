package com.design.mode.creation.singleton.hungry;

/**
 * @author 余嘉乐
 * @date 2022/09/19
 **/
public class MainTest {

    public static void main(String[] args) {
        HungrySingleton instance = HungrySingleton.getInstance();
        HungrySingleton instance1 = HungrySingleton.getInstance();
        System.out.println(instance);
        System.out.println(instance1);

        System.out.println("================================");

        HungryStaticSingleton hungryStaticSingleton = HungryStaticSingleton.getInstance();
        System.out.println(hungryStaticSingleton);
    }
}