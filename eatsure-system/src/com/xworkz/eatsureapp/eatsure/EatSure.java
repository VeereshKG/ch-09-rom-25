package com.xworkz.eatsureapp.eatsure;

public class EatSure {

    public static double search(String foodName) {
        double price = 0.0;

        if (foodName == "CurdRice") {
            price = 99.0;
            return price;
        } else if (foodName == "Vada") {
            price = 59.5;
            return price;
        }
        return price;
    }
}
