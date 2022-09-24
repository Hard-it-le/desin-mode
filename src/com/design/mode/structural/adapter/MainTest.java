package com.design.mode.structural.adapter;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/10
 */
public class MainTest {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3","123");
        audioPlayer.play("mp4","1233133");
        audioPlayer.play("vlc","43411");
        audioPlayer.play("avi","00199");
    }
}
