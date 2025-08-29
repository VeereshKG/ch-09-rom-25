package com.xworkz.furnitureapp;

import com.xworkz.furnitureapp.furniture.Furniture;
import com.xworkz.furnitureapp.table.Table;

public class FurnitureRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Furniture furniture = new Table();
        furniture.typeAvailable();
        System.out.println("main ended");
    }
}
