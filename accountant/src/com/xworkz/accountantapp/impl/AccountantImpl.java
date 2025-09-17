package com.xworkz.accountantapp.impl;

import com.xworkz.accountantapp.accountant.Accountant;

public class AccountantImpl implements Accountant {

    @Override
    public void prepareAccounts() { System.out.println("Accountant preparing accounts"); }
    @Override
    public void auditRecords() { System.out.println("Accountant auditing records"); }
    @Override
    public void generateReport() { System.out.println("Accountant generating financial report"); }
}
