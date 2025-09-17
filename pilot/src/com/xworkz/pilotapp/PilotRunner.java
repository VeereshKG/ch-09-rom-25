package com.xworkz.pilotapp;

import com.xworkz.pilotapp.pilot.Pilot;

public class PilotRunner {

    public static void main(String[] args) {
        Pilot pilot = new PilotImpl();
        pilot.prepareFlight();
        pilot.operateAircraft();
        pilot.landAircraft();
    }
}
