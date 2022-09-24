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
        if ("mp3".equalsIgnoreCase(audioType)) {
            System.out.println("mp3 file : " + fileName);
        } else if (("vlc".equalsIgnoreCase(audioType)) || ("mp4".equalsIgnoreCase(audioType))) {
            mediaPlayerAdapter = new MediaPlayerAdapter(audioType);
            mediaPlayerAdapter.play(audioType, fileName);
        } else {
            System.out.println("错误了");
        }
    }
}
