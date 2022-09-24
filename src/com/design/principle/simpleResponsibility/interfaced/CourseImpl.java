package com.design.principle.simpleResponsibility.interfaced;

/**

 */
public class CourseImpl implements ICourseInfo, ICourseManage {
    @Override
    public String getCourseName() {
        return null;
    }

    @Override
    public byte[] getCourseVideo() {
        return new byte[0];
    }

    @Override
    public void studyCourse() {

    }

    @Override
    public void refundCourse() {

    }
}
