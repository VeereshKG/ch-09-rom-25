package com.xworkz.AmusementParkapp;

import com.xworkz.AmusementParkapp.AmusementPark.AmusementPark;

public class AmusementParkRunner {

    public static void main(String[] args) {

        AmusementPark amusementPark = new AmusementPark();
        amusementPark.setParkId(1);
        amusementPark.setName("wonderla");
        amusementPark.setLocation("banglore");
        amusementPark.setEntryFee(1200.00);
        amusementPark.setOpeningTime("10:00AM");
        amusementPark.setClosingTime("8:00PM");

       int parkId =  amusementPark.getParkId();
       String name = amusementPark.getName();
       String location = amusementPark.getLocation();
       double fee = amusementPark.getEntryFee();
       String open = amusementPark.getOpeningTime();
       String close = amusementPark.getClosingTime();

        System.out.println("the park id is " + parkId);
        System.out.println("the name is " + name);
        System.out.println("the location is " +location );
        System.out.println("the entry fee is " + fee);
        System.out.println("the opening time is " + open);
        System.out.println("the closing time is " +close );
    }
}
