package com.xworkz.zomatoapp;

import com.xworkz.zomatoapp.zomato.Zomato;

public class ZomatoRunner {

    public static void main(String []nonVeg) {
        String foodName = "GheeRice";
        double price = Zomato.search(foodName);
        if (price > 0.0)
            System.out.println("the price  " + foodName + " is :" + price);
    }
    }
