package com.xworkz.mechanicapp.impl;

import com.xworkz.mechanicapp.mechanic.Mechanic;

public class MechanicImpl implements Mechanic {

    @Override
    public void inspect() { System.out.println("Mechanic inspecting vehicle"); }
    @Override
    public void repair() { System.out.println("Mechanic repairing vehicle"); }
    @Override
    public void test() { System.out.println("Mechanic testing vehicle after repair"); }

}
