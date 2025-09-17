package com.xworkz.flipkartapp.impl;

import com.xworkz.flipkartapp.flipkart.Flipkart;

public class FlipkartImpl implements Flipkart {

    @Override
    public void addToCart() { System.out.println("Item added to online order cart"); }
    @Override
    public void checkout() { System.out.println("Checkout process completed"); }
    @Override
    public void confirmOrder() { System.out.println("Online order confirmed"); }

}
