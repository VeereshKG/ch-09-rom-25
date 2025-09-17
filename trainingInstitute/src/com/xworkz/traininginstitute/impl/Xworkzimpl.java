package com.xworkz.traininginstitute.impl;

import com.xworkz.traininginstitute.institute.TrainingInstitute;

public class Xworkzimpl implements TrainingInstitute {
    @Override
    public void trainStudent() {
        System.out.println("train student");
    }

    @Override
    public void guide() {
        System.out.println("guide");
    }

    @Override
    public void provideCertificate() {
        System.out.println("certificate");
    }
}
