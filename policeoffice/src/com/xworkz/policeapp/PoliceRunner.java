package com.xworkz.policeapp;

import com.xworkz.policeapp.impl.PoliceImpl;
import com.xworkz.policeapp.police.Police;

public class PoliceRunner {

    public static void main(String[] args) {

        Police officer = new PoliceImpl();
        officer.patrol();
        officer.respondToIncident();
        officer.investigation();
    }
}
