package com.xworkz.crackersapp;

import com.xworkz.crackersapp.crackers.Crackers;

public class CrackersRunner {

    public static void main(String[] args) {

        Crackers cracker = new Crackers();

        cracker.setCrackerId(1);
        cracker.setName("Flower Pot");
        cracker.setBrand("Standard");
        cracker.setPrice(50.0);
        cracker.setIsLoud(false);

      int id =  cracker.getCrackerId();
     String name =   cracker.getName();
     String brand =    cracker.getBrand();
    double price =    cracker.getPrice();
    boolean loud =    cracker.getIsLoud();
        System.out.println("the cracker id is " + id);
        System.out.println("the cracker name is " +name );
        System.out.println("the brand is " + brand);
        System.out.println("the price is " + price);
        System.out.println("is it loud " + loud);
    }
}
