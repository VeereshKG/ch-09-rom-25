package com.xworkz.musicapp.music.impl;

import com.xworkz.musicapp.music.Music;

public class MusicImpl implements Music {
    public void play() {
        System.out.println("Music started playing");
    }

    @Override
    public void pause() {
        System.out.println("Music paused");
    }

    @Override
    public void stop() {
        System.out.println("Music stopped");
    }
}
