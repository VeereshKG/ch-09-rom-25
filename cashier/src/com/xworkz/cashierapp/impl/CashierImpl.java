package com.xworkz.cashierapp.impl;

import com.xworkz.cashierapp.cashier.Cashier;

public class CashierImpl implements Cashier {

    @Override
    public void acceptPayment() { System.out.println("Cashier accepting payment"); }
    @Override
    public void giveReceipt() { System.out.println("Cashier giving receipt"); }
    @Override
    public void manageChange() { System.out.println("Cashier managing change"); }
}
