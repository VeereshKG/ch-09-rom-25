package com.xworkz.coinsapp;

import com.xworkz.coinsapp.coins.Coins;

public class CoinsRunner {

    public static void main(String[] args) {
        Coins coins = new Coins();

        coins.setCoinId(1);
        coins.setCountry("India");
        coins.setMaterial("Steel");
        coins.setYear(2000);
        coins.setValue(1.0);
        coins.setShape("Round");

       int id =  coins.getCoinId();
       String country =  coins.getCountry();
       String material = coins.getMaterial();
       int year = coins.getYear();
       double value = coins.getValue();
       String shape  = coins.getShape();

        System.out.println("the coin id is " + id);
        System.out.println("the country is " + country);
        System.out.println("the material is " +material );
        System.out.println("the year is " + year);
        System.out.println("the value is " +value );
        System.out.println("the shape is " +shape);;
    }

}
