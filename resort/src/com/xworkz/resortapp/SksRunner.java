package com.xworkz.resortapp;

import com.xworkz.resortapp.impl.SksImpl;
import com.xworkz.resortapp.resort.Resort;

public class SksRunner {
    public static void main(String[] args) {


        Resort resort = new SksImpl();

        resort.facilities();
        resort.checkIn();
        resort.checkOut();

    }
}
