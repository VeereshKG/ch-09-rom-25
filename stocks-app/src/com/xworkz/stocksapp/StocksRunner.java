package com.xworkz.stocksapp;

import com.xworkz.stocksapp.operations.StockOperations;
import com.xworkz.stocksapp.operations.impl.GrowImpl;

public class StocksRunner {
    public static void main(String[] args) {
        StockOperations grow = new GrowImpl();
        grow.buyStock();
        grow.sellStock();
        grow.checkMarketPrice();
    }
}
