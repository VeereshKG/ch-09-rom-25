package com.xworkz.jwelleryapp;

import com.xworkz.jwelleryapp.jwellery.Jwellery;

public class JwelleryRunner {

    public static void main(String[] jwellery) {

        Jwellery jwellery1 = new Jwellery();

        jwellery1.setJwelleryId(1);
        jwellery1.setType("Necklace");
        jwellery1.setMetal("Gold");
        jwellery1.setWeight(15.0);
        jwellery1.setPrice(70000.0);

        int id = jwellery1.getJwelleryId();
        String type = jwellery1.getType();
        String metal = jwellery1.getMetal();
        double weight = jwellery1.getWeight();
        double price = jwellery1.getPrice();

        System.out.println("the jwelleryId is"+id);
        System.out.println("the type is " + type);
        System.out.println("the metal is " + metal);
        System.out.println("the weight is " +weight);
        System.out.println("the price is " + price);
    }
    }
