package com.xworkz.deviceapp.phone;

import com.xworkz.deviceapp.device.Device;

public class Phone extends Device {

    public Phone(){
        System.out.println("Phone constructor is invoked");
    }

    @Override
    public void available() {
        System.out.println("only phone types are available");
    }
}
