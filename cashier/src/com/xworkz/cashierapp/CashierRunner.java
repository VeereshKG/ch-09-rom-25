package com.xworkz.cashierapp;

import com.xworkz.cashierapp.cashier.Cashier;
import com.xworkz.cashierapp.impl.CashierImpl;

public class CashierRunner {
    public static void main(String[] args) {


        Cashier cashier = new CashierImpl();
        cashier.acceptPayment();
        cashier.giveReceipt();
        cashier.manageChange();
    }
}
