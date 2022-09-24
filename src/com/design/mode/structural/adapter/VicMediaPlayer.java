package com.design.mode.structural.adapter;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/10
 */
public class VicMediaPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVic(String fileName) {
        System.out.println("playing vic file:"+fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
