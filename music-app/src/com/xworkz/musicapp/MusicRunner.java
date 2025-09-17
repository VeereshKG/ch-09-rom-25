package com.xworkz.musicapp;

import com.xworkz.musicapp.music.Music;
import com.xworkz.musicapp.music.impl.MusicImpl;

public class MusicRunner {
    public static void main(String[] args) {
        Music player = new MusicImpl();
        player.play();
        player.pause();
        player.stop();
    }
}
