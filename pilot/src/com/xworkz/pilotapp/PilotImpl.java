package com.xworkz.pilotapp;

import com.xworkz.pilotapp.pilot.Pilot;

public class PilotImpl implements Pilot {
    @Override
    public void prepareFlight() {
        System.out.println("prepare");
    }

    @Override
    public void operateAircraft() {
        System.out.println("operate");
    }

    @Override
    public void landAircraft() {
        System.out.println("land");
    }
}
