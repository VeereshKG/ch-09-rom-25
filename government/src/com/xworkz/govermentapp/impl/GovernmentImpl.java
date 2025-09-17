package com.xworkz.govermentapp.impl;

import com.xworkz.govermentapp.government.Government;

public class GovernmentImpl implements Government {

    @Override
    public void proposePolicy() { System.out.println(" proposing new policy"); }
    @Override
    public void debatePolicy() { System.out.println(" debating in assembly"); }
    @Override
    public void implementPolicy() { System.out.println(" implementing policy"); }
}
