package com.xworkz.companyapp.project;

import com.xworkz.companyapp.constants.CompanyName;
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
    private CompanyName companyName;
    private String projectName;
    private int noOfMembers;
    private int noOfDeveloper;
}
