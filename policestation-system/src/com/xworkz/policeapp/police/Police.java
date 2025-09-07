package com.xworkz.policeapp.police;

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
    private String typeOfPost;
    private String name;
    private double salary;
    private int experience;



}
