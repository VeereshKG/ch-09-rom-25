package com.xworkz.beauticianapp;

import com.xworkz.beauticianapp.beautician.Beautician;
import com.xworkz.beauticianapp.impl.BeauticianImpl;

public class BeauticianRunner {

    public static void main(String[] args) {
        Beautician beautician = new BeauticianImpl();
        beautician.applyMakeup();
        beautician.styleHair();
        beautician.giveFacial();
    }
}
