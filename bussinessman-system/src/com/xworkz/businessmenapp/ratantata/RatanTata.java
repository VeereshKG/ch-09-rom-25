package com.xworkz.businessmenapp.ratantata;

import com.xworkz.businessmenapp.bussiness.Bussinessmen;

public class RatanTata extends Bussinessmen {

   public RatanTata(){
       super();
        System.out.println("ratanTata constructor is invoked");
    }
    @Override
    public double doBussiness(){
       System.out.println("business in itsector and vehicle field");
       return 80000.00;
    }
}
