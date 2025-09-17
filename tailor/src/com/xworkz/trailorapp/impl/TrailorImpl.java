package com.xworkz.trailorapp.impl;

import com.xworkz.trailorapp.trailor.Trailor;

public class TrailorImpl implements Trailor {

    @Override
    public void takeMeasurements() { System.out.println("Tailor taking measurements"); }
    @Override
    public void stitchClothes() { System.out.println("Tailor stitching clothes"); }
    @Override
    public void deliverClothes() { System.out.println("Tailor delivering clothes to customer"); }
}
