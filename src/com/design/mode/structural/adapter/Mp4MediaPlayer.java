package com.design.mode.structural.adapter;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/10
 */
public class Mp4MediaPlayer  implements  AdvancedMediaPlayer{
    @Override
    public void playVic(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("playing mp4 file:"+fileName);
    }
}
