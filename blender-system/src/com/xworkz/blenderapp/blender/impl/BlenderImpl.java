package com.xworkz.blenderapp.blender.impl;

import com.xworkz.blenderapp.blender.Blender;

public class BlenderImpl implements Blender {
    public void startBlending() {
        System.out.println("Blender started blending");
    }

    @Override
    public void stopBlending() {
        System.out.println("Blender stopped blending");
    }

    @Override
    public void setSpeed() {
        System.out.println("Blender speed set");
    }

}
