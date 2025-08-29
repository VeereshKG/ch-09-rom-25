package com.xworkz.brandapp.bata;

import com.xworkz.brandapp.brand.Brand;

public class Bata extends Brand {

    public Bata(){
        super();
        System.out.println("bata cons is invoked");
    }
    @Override
    public void toProvide(){
        System.out.println("only provide bata type of shoes and slipper");
    }
}
