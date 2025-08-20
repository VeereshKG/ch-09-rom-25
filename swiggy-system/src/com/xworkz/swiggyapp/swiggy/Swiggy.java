package com.xworkz.swiggyapp.swiggy;

public class Swiggy {

    public static double search(String foodName) {
        double price = 0.0;

        if (foodName == "DalKichadi") {
            price = 100.0;
            return price;
        } else if (foodName == "PalakRice") {
            price = 110.0;
            return price;


        }
        return price;
    }
}
