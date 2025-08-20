package com.xworkz.zomatoapp.zomato;

public class Zomato {
    public static double search(String foodName){
        double price = 0.0;

        if(foodName == "GheeRice"){
            price = 269.0;
            return price;
        }
        else if(foodName == "ChickenDry"){
            price = 275.0;
            return price;
        }
        return price;
    }


}
