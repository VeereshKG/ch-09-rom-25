package com.xworkz.shoppingapp;

import com.xworkz.shoppingapp.mantrisquare.MantriSquare;
import com.xworkz.shoppingapp.shoppingmall.ShoppingMall;

public class ShoppingMallRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        ShoppingMall shoppingMall = new MantriSquare();
        shoppingMall.toShopping();
        System.out.println("main ended");

    }
}
