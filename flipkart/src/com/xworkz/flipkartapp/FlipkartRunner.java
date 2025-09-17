package com.xworkz.flipkartapp;

import com.xworkz.flipkartapp.flipkart.Flipkart;
import com.xworkz.flipkartapp.impl.FlipkartImpl;

public class FlipkartRunner {

    public static void main(String[] args) {
        Flipkart flipkart = new FlipkartImpl();
        flipkart.addToCart();
        flipkart.checkout();
        flipkart.confirmOrder();
    }
}
