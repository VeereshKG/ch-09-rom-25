package com.xworkz.driverapp.impl;

import com.xworkz.driverapp.driver.Driver;

public class DriverImpl implements Driver {

    @Override
    public void startVehicle() { System.out.println("Driver starting the vehicle"); }
    @Override
    public void drive() { System.out.println("Driver driving safely"); }
    @Override
    public void stopVehicle() { System.out.println("Driver stopping the vehicle"); }
}
