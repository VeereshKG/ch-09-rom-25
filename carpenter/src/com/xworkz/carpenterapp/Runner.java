package com.xworkz.carpenterapp;

import com.xworkz.carpenterapp.carpenter.Carpenter;
import com.xworkz.carpenterapp.impl.CarpenterImpl;

public class Runner {

    public static void main(String[] args) {
        Carpenter carpenter = new CarpenterImpl();
        carpenter.cutWood();
        carpenter.assembleFurniture();
        carpenter.polishFurniture();
    }
}
