package com.xworkz.electricianapp.impl;

import com.xworkz.electricianapp.electrician.Electrician;

public class ElectricianImpl implements Electrician {

    @Override
    public void installWiring() { System.out.println("Electrician installing wiring"); }
    @Override
    public void repairCircuit() { System.out.println("Electrician repairing electrical circuit"); }
    @Override
    public void testConnection() { System.out.println("Electrician testing power connection"); }

}
