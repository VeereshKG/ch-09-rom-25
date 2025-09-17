package com.xworkz.factoryapp.impl;

import com.xworkz.factoryapp.factory.Factory;

public class factorImpl implements Factory {

    @Override
    public void startProduction() { System.out.println("Factory starting production line"); }
    @Override
    public void monitorProduction() { System.out.println("Factory monitoring production process"); }
    @Override
    public void stopProduction() { System.out.println("Factory stopping production line"); }
}
