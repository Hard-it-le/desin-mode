package com.design.mode.structural.flyweight;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/15
 * <p>
 * 具体享元类
 */

public class BeautifulWaitress extends AbstractWaitressFlyWeight {

    String id;
    String name;
    int age;


    @Override
    void service() {
        System.out.println("工号：" + id + ";" + name + " " + age + "正在为你服务");
        this.canServices = false;
    }

    @Override
    void end() {
        System.out.println("工号：" + id + ";" + name + " " + age + "服务结束");
        this.canServices = true;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "BeautifulWaitress{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
