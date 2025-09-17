package com.xworkz.lightapp;

import com.xworkz.lightapp.impl.LightImpl;
import com.xworkz.lightapp.light.Dimmable;

public class lightRunner {
    public static void main(String[] args) {


        Dimmable light1 = new LightImpl();

        light1.dim();
        light1.brighten();
        light1.switchOn();
    }
}