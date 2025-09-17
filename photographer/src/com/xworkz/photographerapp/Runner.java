package com.xworkz.photographerapp;

import com.xworkz.photographerapp.impl.PhotograherImpl;
import com.xworkz.photographerapp.photograher.Photograher;

public class Runner {

    public static void main(String[] args) {
        Photograher photographer = new PhotograherImpl();
        photographer.setupCamera();
        photographer.takePhoto();
        photographer.editPhoto();
    }
}
