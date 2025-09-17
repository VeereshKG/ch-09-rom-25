package com.xworkz.accountantapp;

import com.xworkz.accountantapp.accountant.Accountant;
import com.xworkz.accountantapp.impl.AccountantImpl;

public class Runner {

    public static void main(String[] args) {
        Accountant accountant = new AccountantImpl();
        accountant.prepareAccounts();
        accountant.auditRecords();
        accountant.generateReport();
    }
}
