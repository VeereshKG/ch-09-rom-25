package com.xworkz.carpenterapp.impl;

import com.xworkz.carpenterapp.carpenter.Carpenter;

public class CarpenterImpl implements Carpenter {

    @Override
    public void cutWood() { System.out.println("Carpenter cutting wood"); }
    @Override
    public void assembleFurniture() { System.out.println("Carpenter assembling furniture"); }
    @Override
    public void polishFurniture() { System.out.println("Carpenter polishing furniture"); }
}
