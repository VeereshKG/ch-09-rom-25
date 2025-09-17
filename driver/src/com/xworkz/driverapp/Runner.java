package com.xworkz.driverapp;

import com.xworkz.driverapp.driver.Driver;
import com.xworkz.driverapp.impl.DriverImpl;

public class Runner {

    public static void main(String[] args) {
        Driver driver = new DriverImpl();
        driver.startVehicle();
        driver.drive();
        driver.stopVehicle();
    }
}
