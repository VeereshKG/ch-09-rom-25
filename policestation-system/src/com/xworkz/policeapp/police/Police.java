package com.xworkz.policeapp.police;

import com.xworkz.policeapp.constants.TypeOfPost;
import lombok.AllArgsConstructor;
import lombok.Getter;

import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Police {
   private int policeId;
    private TypeOfPost typeOfPost;
    private String name;
    private double salary;
    private int experience;



}
