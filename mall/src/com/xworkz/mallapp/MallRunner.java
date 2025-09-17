package com.xworkz.mallapp;

import com.xworkz.mallapp.impl.MallImpl;
import com.xworkz.mallapp.mall.Mall;

public class MallRunner {

    public static void main(String[] args) {

        Mall mall = new MallImpl();
        mall.openShops();
        mall.provideParking();
        mall.providePvr();
    }
}
