package com.xworkz.networkapp;

import com.xworkz.networkapp.airtel.AirtelNetwork;
import com.xworkz.networkapp.vi.ViNetwork;

public class NetworkRunner {
    public static void main(String[] args) {

        System.out.println("main started");

        AirtelNetwork network = new AirtelNetwork();

        network.setNetWorkId(1);
        network.setNetWorkRange(2.4);


        System.out.println("the airtel network id is "+network.getNetWorkId());
        System.out.println("the airtel network range is "+network.getNetWorkRange());

        ViNetwork network1 = new ViNetwork();

        network1.setViNetWorkId(2);
        network1.setViNetWorkRange(5.0);

       int id = network1.getViNetWorkId();
       double range =  network1.getViNetWorkRange();
        System.out.println("the vi network range is "+id);
        System.out.println("the vi networkId is "+range);


        System.out.println("main ended");
    }
}
