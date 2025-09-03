package com.xworkz.policeapp;

import com.xworkz.policeapp.police.Police;
import com.xworkz.policeapp.policestation.PoliceStation;

public class PoliceStationRunner {
    public static void main(String[] args) {
        Police police1= new Police(402,"suresh","constable",15000.00,5);

        Police police2 = new Police(2,"SI","Raju",40000.00,5);
        Police police3 = new Police(3,"constable","ramu",20000.00,2);
        Police police4 = new Police(4,"inspector","baba",35000.00,6);
        Police police5 = new Police(5,"inspector","kalam",37000.00,5);




        PoliceStation policeStation=new PoliceStation();

        policeStation.addPolice(police1);
        policeStation.addPolice(police2);
        policeStation.addPolice(police3);
        policeStation.addPolice(police4);
        policeStation.addPolice(police5);
        policeStation.getAllPoliceDetails();
    }
}
