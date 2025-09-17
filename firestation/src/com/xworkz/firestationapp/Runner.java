package com.xworkz.firestationapp;

import com.xworkz.firestationapp.firestation.FireStation;
import com.xworkz.firestationapp.impl.FireStationimpl;

public class Runner {

    public static void main(String[] args) {
        FireStation fireStation = new FireStationimpl();
        fireStation.respondToFire();
        fireStation.rescuePeople();
        fireStation.extinguishFire();
    }
}
