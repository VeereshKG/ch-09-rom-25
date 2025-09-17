package com.xworkz.fanapp;

import com.xworkz.fanapp.fan.Fan;
import com.xworkz.fanapp.fan.impl.FanImpl;

public class FanRunner {
    public static void main(String[] args) {
        Fan fan = new FanImpl();
        fan.startFan();
        fan.setSpeed();
        fan.stopFan();
    }
}
