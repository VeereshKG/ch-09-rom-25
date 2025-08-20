package com.xworkz.bladeapp;

import com.xworkz.bladeapp.blade.Blade;

public class BladeRunner {
    public static void main(String[] args) {

      Blade  blade = new Blade();
      blade.setBladeId(1);
      blade.setBrand("Super");
      blade.setPrice(25.0);
      blade.setType("shaving");

      int id = blade.getBladeId();
      String brand = blade.getBrand();
      double price = blade.getPrice();
      String  type = blade.getType();
            System.out.println("the blade id is " +id);
            System.out.println("the brand is " +brand );
            System.out.println("the price of blade is " + price);
            System.out.println("the type of blade is "+type );



    }
}
