package com.xworkz.shoppingapp.mantrisquare;

import com.xworkz.shoppingapp.shoppingmall.ShoppingMall;

public class MantriSquare extends ShoppingMall {
    public MantriSquare(){
        super();
        System.out.println("MantriSquare constructor is invoked");
    }

    @Override
    public void toShopping(){
        System.out.println("for Shopping and watch movies");
    }
}
