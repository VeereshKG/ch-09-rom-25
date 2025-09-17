package com.xworkz.youtubeapp;

import com.xworkz.youtubeapp.impl.YoutubeImpl;
import com.xworkz.youtubeapp.youtube.Youtube;

public class Runner {

    public static void main(String[] args) {

        Youtube youtube = new YoutubeImpl();

        youtube.seeContent();
        youtube.subscribe();
        youtube.unsubscribe();
    }
}
