package com.xworkz.eatsureapp;

import com.xworkz.eatsureapp.eatsure.EatSure;

public class EatSureRunner {

    public static void main(String []veg) {
        String foodName = "CurdRice";
        double price = EatSure.search(foodName);
        if (price > 0.0)
            System.out.println("the price  of " + foodName + " is :" + price);
    }
    }
