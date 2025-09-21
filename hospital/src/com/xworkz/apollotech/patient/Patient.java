package com.xworkz.apollotech.patient;

import com.xworkz.apollotech.constants.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Patient {

    private  int patientId;
    private String name;
    private int age;
    private String gender;
    private String disease;

}
