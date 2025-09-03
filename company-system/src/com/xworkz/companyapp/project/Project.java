package com.xworkz.companyapp.project;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Project {
    private int projectId;
    private String companyName;
    private String projectName;
    private int noOfMembers;
    private int noOfDeveloper;


}
