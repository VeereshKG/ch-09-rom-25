package com.xworkz.plasticapp.bottle;

import com.xworkz.plasticapp.plastic.Plastic;

public class Bottle extends Plastic {
    public Bottle(){
        super();
        System.out.println("Bottle constructor is invoked");
    }
    public void toStore(){
        System.out.println("to store water ");
    }
}
