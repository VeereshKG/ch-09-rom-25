package com.xworkz.policeapp;

import com.xworkz.policeapp.police.Police;
import com.xworkz.policeapp.policestation.PoliceStation;

import java.util.Scanner;

public class PoliceStationRunner {
    public static void main(String[] args) {
//        Police police1= new Police(402,"suresh","constable",15000.00,5);
//
//        Police police2 = new Police(2,"SI","Raju",40000.00,5);
//        Police police3 = new Police(3,"constable","ramu",20000.00,2);
//        Police police4 = new Police(4,"inspector","baba",35000.00,6);
//        Police police5 = new Police(5,"inspector","kalam",37000.00,5);
//
//        PoliceStation policeStation=new PoliceStation();
//
//        policeStation.addPolice(police1);
//        policeStation.addPolice(police2);
//        policeStation.addPolice(police3);
//        policeStation.addPolice(police4);
//        policeStation.addPolice(police5);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of police to be add :");
        int size = scanner.nextInt();

        PoliceStation policeStation = new PoliceStation(size);
        System.out.println("Enter no of polices are available :"+policeStation.polices.length);

        for (int index=0; index<size ; index++){
            Police police = new Police();

            System.out.println("Enter police Id :");
            police.setPoliceId(scanner.nextInt());

            System.out.println("Enter police name");
            police.setName(scanner.next());

            System.out.println("Enter type of post :");
            police.setTypeOfPost(scanner.next());

            System.out.println("Enter salary :");
            police.setSalary(scanner.nextDouble());

            System.out.println("Enter Experience");
            police.setExperience(scanner.nextInt());

            policeStation.addPolice(police);
        }

        policeStation.getAllPoliceDetails();
    }
}
