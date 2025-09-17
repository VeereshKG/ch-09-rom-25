package com.xworkz.vacuumapp.impl;

import com.xworkz.vacuumapp.vacuum.Vacuum;

public class Lgimpl implements Vacuum {
    @Override
    public void startCleaning() {
        System.out.println("startCleaning");
    }

    @Override
    public void stopCleaning() {
        System.out.println("stopCleaning");
    }

    @Override
    public void empty() {
        System.out.println("empty vaccum");
    }
}
