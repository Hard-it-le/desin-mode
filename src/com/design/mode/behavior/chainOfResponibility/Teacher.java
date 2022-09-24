package com.design.mode.behavior.chainOfResponibility;

/**

 */
public  class Teacher {
    /**
     * 下一个老师
     */
    private  Teacher next;

    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getNext() {
        return next;
    }

    public void setNext(Teacher next) {
        this.next = next;
    }

    void handleRequest(){
        System.out.println(this+":正在处理...");

        if (next != null){
            next.handleRequest();
        }

    };

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                '}';
    }
}
