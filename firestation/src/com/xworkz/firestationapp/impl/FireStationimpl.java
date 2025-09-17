package com.xworkz.firestationapp.impl;

import com.xworkz.firestationapp.firestation.FireStation;

public class FireStationimpl implements FireStation {

    @Override
    public void respondToFire() { System.out.println("Firefighter rushing to fire scene"); }
    @Override
    public void rescuePeople() { System.out.println("Firefighter rescuing trapped people"); }
    @Override
    public void extinguishFire() { System.out.println("Firefighter extinguishing fire"); }
}
