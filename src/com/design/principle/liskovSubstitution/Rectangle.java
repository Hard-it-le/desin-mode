package com.design.principle.liskovSubstitution;

/**
 * Created by Tom on 2020/2/16.
 */
public class Rectangle implements QuadRangle {
    private long height;
    private long width;



    public void setHeight(long height) {
        this.height = height;
    }



    public void setWidth(long width) {
        this.width = width;
    }

    @Override
    public long getWidth() {
        return 0;
    }

    @Override
    public long getHeight() {
        return 0;
    }
}
