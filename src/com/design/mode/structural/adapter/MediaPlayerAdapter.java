package com.design.mode.structural.adapter;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/10
 */
public class MediaPlayerAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaPlayerAdapter(String audioType) {
        if ("vlc".equalsIgnoreCase(audioType)) {
            advancedMediaPlayer = new VicMediaPlayer();
        } else if ("mp4".equalsIgnoreCase(audioType)) {
            advancedMediaPlayer = new Mp4MediaPlayer();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if ("vlc".equalsIgnoreCase(audioType)) {
            advancedMediaPlayer.playVic(fileName);
        } else if ("mp4".equalsIgnoreCase(audioType)) {
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
