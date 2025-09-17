package com.xworkz.blenderapp;

import com.xworkz.blenderapp.blender.Blender;
import com.xworkz.blenderapp.blender.impl.BlenderImpl;

public class BlenderRunner {
    public static void main(String[] args) {
        Blender blender = new BlenderImpl();
        blender.startBlending();
        blender.setSpeed();
        blender.stopBlending();
    }
}
