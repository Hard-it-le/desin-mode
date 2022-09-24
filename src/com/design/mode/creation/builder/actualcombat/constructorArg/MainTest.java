package com.design.mode.creation.builder.actualcombat.constructorArg;

/**
 * @author yujiale
 */
public class MainTest {

    public static void main(String[] args) {
        ConstructorArg hello = new ConstructorArgBuilder().setIsRef(true).setArg("hello").setType(MainTest.class).build();
        System.out.println(hello);
    }
}
