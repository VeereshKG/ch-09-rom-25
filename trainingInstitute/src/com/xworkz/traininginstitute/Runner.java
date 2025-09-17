package com.xworkz.traininginstitute;

import com.xworkz.traininginstitute.impl.Xworkzimpl;
import com.xworkz.traininginstitute.institute.TrainingInstitute;

public class Runner {
    public static void main(String[] args) {

        TrainingInstitute trainingInstitute = new Xworkzimpl();

        trainingInstitute.trainStudent();
        trainingInstitute.guide();
        trainingInstitute.provideCertificate();
    }
}
