package com.xworkz.workerapp;

import com.xworkz.workerapp.farmer.Farmer;

public class WorkerRunner {
    public static void main(String[] args) {
        System.out.println("main Started");
        Farmer farmer = new Farmer();
        System.out.println("main ended");
    }
}
