package com.xworkz.policeapp.policestation;

import com.xworkz.policeapp.police.Police;

public class PoliceStation {
    Police[] polices = new Police[5];
    int index;

    public boolean addPolice(Police police) {
        boolean isPoliceAdded = false;

        if (police != null) {
            polices[index++] = police;
            isPoliceAdded = true;
        } else System.out.println("invalid police");
        return isPoliceAdded;
    }

    public void getAllPoliceDetails() {
        System.out.println("the list of polise are:");
        for (Police police : polices) {


            System.out.println("the id of the police is  " + police.getPoliceId());
            System.out.println("the name of the police is  " + police.getName());
            System.out.println("the type of post of the police is  " + police.getTypeOfPost());
            System.out.println("the salary of the police is  " + police.getSalary());
            System.out.println("the experience of the police is  " + police.getExperience());
            System.out.println("-----------------------------------------------");

        }

    }
}