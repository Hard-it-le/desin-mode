package com.design.principle.liskovSubstitution;

/**
 * Created by Tom on 2020/2/16.
 */
public class Square implements QuadRangle {
    private long length;

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
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
