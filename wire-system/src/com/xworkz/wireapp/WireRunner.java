package com.xworkz.wireapp;

import com.xworkz.wireapp.wire.Wire;

public class WireRunner {

    public static void main(String[] args) {
        System.out.println("main Started");
      Wire wire1 = new Wire();
      wire1.setWireId(1);
      wire1.setBrand("philips ");
      wire1.setColor("black");
      wire1.setPrice(500.0);

      int id = wire1.getWireId();
      String brand  = wire1.getBrand();
      String color = wire1.getColor();
      double price = wire1.getPrice();

        System.out.println("the wire id is "+id);
        System.out.println("the wire brand is "+brand);
        System.out.println("the wire color is "+color);
        System.out.println("the wire price is "+price);
        System.out.println("main ended");



    }
}
