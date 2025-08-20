package com.xworkz.balzzerapp;

import com.xworkz.balzzerapp.blazzer.Blazzer;

public class BlazzerRunner {
    public static void main(String[] args) {


        Blazzer blazzer = new Blazzer();

        blazzer.setBlazzerId(1);
        blazzer.setColor("black");
        blazzer.setSize(30);
        blazzer.setBrand("peter england");
        blazzer.setPrice(4000.0);
        blazzer.setFabric("Cotton");

//      int id =  blazzer.getBlazzerId();
      String color = blazzer.getColor();
      int size = blazzer.getSize();
      String brand = blazzer.getBrand();
      double price = blazzer.getPrice();
      String fabric = blazzer.getFabric();

        System.out.println("the blazzer ID is "+blazzer.getBlazzerId());
        System.out.println("the color of blazzer is "+color);
        System.out.println("the size of blazzer is "+size);
        System.out.println("the brand of blazzer is "+brand);
        System.out.println("the price is blazzer is "+price);
        System.out.println("the fabric is "+fabric);

    }
}
