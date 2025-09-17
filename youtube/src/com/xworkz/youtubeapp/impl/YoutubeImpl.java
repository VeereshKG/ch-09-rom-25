package com.xworkz.youtubeapp.impl;

import com.xworkz.youtubeapp.youtube.Youtube;

public class YoutubeImpl implements Youtube {
    @Override
    public void subscribe() {
        System.out.println("subscribe");
    }

    @Override
    public void unsubscribe() {
        System.out.println("unsubscribe");
    }

    @Override
    public void seeContent() {
        System.out.println("content");
    }
}
