package com.xworkz.trailorapp;

import com.xworkz.trailorapp.impl.TrailorImpl;
import com.xworkz.trailorapp.trailor.Trailor;

public class TrailorRunner {

    public static void main(String[] args) {
        Trailor tailor = new TrailorImpl();
        tailor.takeMeasurements();
        tailor.stitchClothes();
        tailor.deliverClothes();
    }
}
