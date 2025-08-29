package com.xworkz.businessmenapp;

import com.xworkz.businessmenapp.bussiness.Bussinessmen;
import com.xworkz.businessmenapp.ratantata.RatanTata;

public class BusinessRunner {

    public static void main(String[] args) {

        System.out.println("main started");
        Bussinessmen bussinessmen = new RatanTata();
        bussinessmen.doBussiness();
        System.out.println("main ended");
    }
}
