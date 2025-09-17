package com.xworkz.policeapp.impl;

import com.xworkz.policeapp.police.Police;

public class PoliceImpl implements Police {
    @Override
    public void patrol() {
        System.out.println("patrol");
    }

    @Override
    public void respondToIncident() {
        System.out.println("incident");
    }

    @Override
    public void investigation() {
        System.out.println("investigation");
    }
}
