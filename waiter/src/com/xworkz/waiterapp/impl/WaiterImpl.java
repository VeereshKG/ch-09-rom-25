package com.xworkz.waiterapp.impl;

import com.xworkz.waiterapp.waiter.Waiter;

public class WaiterImpl implements Waiter {

    @Override
    public void takeOrder() { System.out.println("Waiter taking customer order"); }
    @Override
    public void serveFood() { System.out.println("Waiter serving food to customer"); }
    @Override
    public void clearTable() { System.out.println("Waiter clearing the table"); }


}
