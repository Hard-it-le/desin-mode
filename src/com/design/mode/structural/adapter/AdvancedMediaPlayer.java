package com.design.mode.structural.adapter;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/10
 */
public interface AdvancedMediaPlayer {

    /**
     * vic播放
     * @param fileName
     */
    public void playVic(String fileName);

    /**
     * mp4播放
     * @param fileName
     */
    public void playMp4(String fileName);
}
