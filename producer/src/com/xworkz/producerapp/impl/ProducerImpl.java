package com.xworkz.producerapp.impl;

import com.xworkz.producerapp.producer.Producer;

public class ProducerImpl implements Producer {

    @Override
    public void raiseFunds() { System.out.println("Producer raising funds for movie"); }
    @Override
    public void manageBudget() { System.out.println("Producer managing budget"); }
    @Override
    public void distributeProfits() { System.out.println("Producer distributing profits"); }

}
