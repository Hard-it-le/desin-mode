package com.design.principle.dependenceInversion;

/**

 */
public class Test {
    public static void main(String[] args) {
//        Tom tom = new Tom();
//        tom.study(new JavaCourse());
//        tom.study(new PythonCourse());


//        Tom tom = new Tom(new PythonCourse());
//        tom.study();
//
//        Tom tom1 = new Tom(new JavaCourse());
//        tom1.study();

        Tom tom = new Tom();
        tom.setCourse(new JavaCourse());
        tom.study();
    }
}
