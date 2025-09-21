package com.xworkz.lokhasaba.politician;

import com.xworkz.lokhasaba.nationality.Nationality;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Politician {
    private int id;
    private String name;
    private String constitution;
    private int age;
    private Nationality nationality;


}
