package com.xworkz.deliveryapp.impl;

import com.xworkz.deliveryapp.delivery.Delivery;

public class ZeptoImpl implements Delivery {
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
