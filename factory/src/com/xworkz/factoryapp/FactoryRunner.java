package com.xworkz.factoryapp;

import com.sun.security.sasl.digest.FactoryImpl;
import com.xworkz.factoryapp.factory.Factory;
import com.xworkz.factoryapp.impl.factorImpl;

public class FactoryRunner {
    public static void main(String[] args) {
      Factory factory = new factorImpl();
        factory.startProduction();
        factory.monitorProduction();
        factory.stopProduction();
    }

}
