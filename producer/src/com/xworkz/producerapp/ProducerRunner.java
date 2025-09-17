package com.xworkz.producerapp;

import com.xworkz.producerapp.impl.ProducerImpl;
import com.xworkz.producerapp.producer.Producer;

public class ProducerRunner {

    public static void main(String[] args) {
        Producer producer = new ProducerImpl();
        producer.raiseFunds();
        producer.manageBudget();
        producer.distributeProfits();
    }
}
