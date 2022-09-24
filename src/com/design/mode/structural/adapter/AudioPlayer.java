package com.design.mode.structural.adapter;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/10
 */
public class AudioPlayer implements MediaPlayer {
    MediaPlayerAdapter mediaPlayerAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("mp3 file : " + fileName);
        } else if ((audioType.equalsIgnoreCase("vlc")) || (audioType.equalsIgnoreCase("mp4"))) {
            mediaPlayerAdapter = new MediaPlayerAdapter(audioType);
            mediaPlayerAdapter.play(audioType, fileName);
        } else {
            System.out.println("错误了");
        }
    }
}
