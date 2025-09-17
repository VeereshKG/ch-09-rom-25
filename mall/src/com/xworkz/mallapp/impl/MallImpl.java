package com.xworkz.mallapp.impl;

import com.xworkz.mallapp.mall.Mall;

public class MallImpl implements Mall {


    @Override
    public void openShops() {
        System.out.println("open shops");
    }

    @Override
    public void provideParking() {
        System.out.println("provide parking");
    }

    @Override
    public void providePvr() {
        System.out.println("provide pvr");
    }
}
