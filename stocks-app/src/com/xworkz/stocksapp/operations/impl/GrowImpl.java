package com.xworkz.stocksapp.operations.impl;

import com.xworkz.stocksapp.operations.StockOperations;

public class GrowImpl implements StockOperations {
    @Override
    public void buyStock() {
        System.out.println("stocks buyed");
    }

    @Override
    public void sellStock() {
        System.out.println("stocks selled");
    }

    @Override
    public void checkMarketPrice() {
        System.out.println("market price checked");

    }
}
