package com.design.principle.dependenceInversion;

/**

 */
public class Tom {

    private ICourse course;

    public ICourse getCourse() {
        return course;
    }

    public void setCourse(ICourse course) {
        this.course = course;
    }

    public void study() {
        course.study();
    }
}



