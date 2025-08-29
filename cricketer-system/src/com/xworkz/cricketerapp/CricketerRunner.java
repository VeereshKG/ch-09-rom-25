package com.xworkz.cricketerapp;

import com.xworkz.cricketerapp.cricketer.Cricketer;
import com.xworkz.cricketerapp.virat.Virat;

public class CricketerRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Cricketer cricketer = new Virat();
        cricketer.play();
        System.out.println("main ended");
    }
}
