package com.xworkz.photographerapp.impl;

import com.xworkz.photographerapp.photograher.Photograher;

public class PhotograherImpl implements Photograher {
    @Override
    public void setupCamera() {
        System.out.println("setup camera");
    }

    @Override
    public void takePhoto() {
        System.out.println("take photo");
    }

    @Override
    public void editPhoto() {
        System.out.println("edit photo");
    }
}
