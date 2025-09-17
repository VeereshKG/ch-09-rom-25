package com.xworkz.fanapp.fan.impl;

import com.xworkz.fanapp.fan.Fan;

public class FanImpl implements Fan {
    @Override
    public void startFan() {
        System.out.println("Fan started");
    }

    @Override
    public void stopFan() {
        System.out.println("Fan stopped");
    }

    @Override
    public void setSpeed() {
        System.out.println("Fan speed set");
    }
}
