package com.xworkz.chacolateapp;

import com.xworkz.chacolateapp.chacolate.Chacolate;
import com.xworkz.chacolateapp.dairymilk.DairyMilk;

public class ChacolateRunner {
    public static void main(String[] args) {

        System.out.println("main started");
        Chacolate chacolate = new DairyMilk();
        chacolate.doChacolate();
        System.out.println("main ended");
    }
}
