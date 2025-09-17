package com.xworkz.refrigeratorapp.impl;

import com.xworkz.refrigeratorapp.refrigerator.Refrigerator;

public class LgImpl implements Refrigerator {
    @Override
    public void coolingFood() {
        System.out.println("coolingFood");
    }

    @Override
    public void Ice() {
        System.out.println("ice formation");
    }

    @Override
    public void chillWater() {
        System.out.println("chill water");
    }
}
