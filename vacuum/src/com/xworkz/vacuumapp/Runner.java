package com.xworkz.vacuumapp;

import com.xworkz.vacuumapp.impl.Lgimpl;
import com.xworkz.vacuumapp.vacuum.Vacuum;

public class Runner {

    public static void main(String[] args) {

        Vacuum vacuum = new Lgimpl();
        vacuum.startCleaning();
        vacuum.stopCleaning();
        vacuum.empty();
    }
}
