package com.xworkz.retailshop.impl;

import com.xworkz.retailshop.retailshop.RetailShop;

public class ShopImpl implements RetailShop {

    @Override
    public void displayProducts() { System.out.println("Shop displaying products"); }
    @Override
    public void sellProduct() { System.out.println("Shop selling product to customer"); }
    @Override
    public void provideReceipt() { System.out.println("Shop providing receipt to customer");}
}
