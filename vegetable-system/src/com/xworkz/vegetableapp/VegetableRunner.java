package com.xworkz.vegetableapp;

import com.xworkz.vegetableapp.carrot.Carrot;
import com.xworkz.vegetableapp.vegetable.Vegetable;

public class VegetableRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Vegetable vegetable = new Carrot();
        vegetable.todo();
        System.out.println("main ended");

    }
}
