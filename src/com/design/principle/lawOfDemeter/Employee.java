package com.design.principle.lawOfDemeter;

import java.util.ArrayList;
import java.util.List;

/**

 */
public class Employee {

    public void checkNumberOfCourses() {
        List<Course> courseList = new ArrayList<Course>();
        for (int i = 0; i < 20; i++) {
            courseList.add(new Course());
        }
        System.out.println(courseList.size());
    }
}
