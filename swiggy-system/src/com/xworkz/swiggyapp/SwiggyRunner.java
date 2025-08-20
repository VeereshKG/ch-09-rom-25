package com.xworkz.swiggyapp;

import com.xworkz.swiggyapp.swiggy.Swiggy;

public class SwiggyRunner {
    public static void main(String []veg){
        String foodName = "DalKichadi";
        double price = Swiggy.search(foodName);
        if(price > 0.0)
            System.out.println("the price  of "+foodName+" is :"+price);


    }
}
