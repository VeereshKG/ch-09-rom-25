package com.xwork.ecommerceapp.impl;

import com.xwork.ecommerceapp.amazon.Amazon;

public class AmazonImpl implements Amazon {

    @Override
    public void placeOrder() {
        System.out.println("place order");
    }

    @Override
    public void trackOrder() {
        System.out.println("track order");

    }

    @Override
    public void deliverOrder() {
        System.out.println("delivery order");

    }
}
