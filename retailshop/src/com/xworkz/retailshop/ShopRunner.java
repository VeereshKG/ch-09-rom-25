package com.xworkz.retailshop;

import com.xworkz.retailshop.impl.ShopImpl;
import com.xworkz.retailshop.retailshop.RetailShop;

public class ShopRunner {
    public static void main(String[] args) {


        RetailShop shop = new ShopImpl();
        shop.displayProducts();
        shop.sellProduct();
        shop.provideReceipt();
    }
}