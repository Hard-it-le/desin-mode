package com.design.mode.structural.adapter;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/10
 */
public interface MediaPlayer {

    /**
     * 播放
     * @param audioType
     * @param fileName
     */
    public void  play(String audioType,String fileName);
}
