package com.xworkz.waiterapp;

import com.xworkz.waiterapp.impl.WaiterImpl;
import com.xworkz.waiterapp.waiter.Waiter;

public class WaiterRunner {

    public static void main(String[] args) {
        Waiter waiter = new WaiterImpl();
        waiter.takeOrder();
        waiter.serveFood();
        waiter.clearTable();
    }
}