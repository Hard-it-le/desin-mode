package com.design.mode.creation.prototype.actualcombat.mybatis;


public class User implements Cloneable {

    private String name;
    private Integer age;
    private String address;

    public User() {
        System.out.println("User创建了对象");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        User user = new User();
        user.setName(name);
        user.setAge(age);
        user.setAddress(address);
        return user;
    }
}
