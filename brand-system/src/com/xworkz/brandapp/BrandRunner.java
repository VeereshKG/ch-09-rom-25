package com.xworkz.brandapp;

import com.xworkz.brandapp.bata.Bata;
import com.xworkz.brandapp.brand.Brand;

public class BrandRunner {
    public static void main(String[] args) {

        System.out.println("main started");
        Brand brand = new Bata();
        brand.toProvide();
        System.out.println("main ended");
    }
}
