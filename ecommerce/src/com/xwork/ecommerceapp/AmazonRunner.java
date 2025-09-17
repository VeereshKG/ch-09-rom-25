package com.xwork.ecommerceapp;

import com.xwork.ecommerceapp.amazon.Amazon;
import com.xwork.ecommerceapp.impl.AmazonImpl;

public class AmazonRunner {

    public static void main(String[] args) {

        Amazon amazon = new AmazonImpl();

        amazon.placeOrder();
        amazon.trackOrder();
        amazon.deliverOrder();
    }
}
