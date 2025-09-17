package com.xworkz.beauticianapp.impl;

import com.xworkz.beauticianapp.beautician.Beautician;

public class BeauticianImpl implements Beautician {

    @Override
    public void applyMakeup() {
        System.out.println("Beautician applying makeup");
    }

    @Override
    public void styleHair() {
        System.out.println("Beautician styling hair");
    }

    @Override
    public void giveFacial() {
        System.out.println("Beautician giving facial treatment");
    }
}
