package com.xworkz.companyapp.company;

import com.xworkz.companyapp.project.Project;

public class Company {

    Project[] projects = new Project[20];
    int index;

    public boolean addProject(Project project) {
        boolean isProjectAdded = false;

        if (project != null) {
            projects[index++] = project;
            isProjectAdded = true;
        } else System.out.println("invalid project");
        return isProjectAdded;
    }


    public void getAllProjectDetails(){
        System.out.println("the project list are :");
        for (Project project : projects){


        System.out.println("the id of the project is  "+project.getProjectId());
        System.out.println("the company name of the project is  "+project.getCompanyName());
        System.out.println("the name of the project is  "+project.getProjectName());
        System.out.println("the no of members of the project is  "+project.getNoOfMembers());
        System.out.println("the no of developer of the project is  "+project.getNoOfDeveloper());

        System.out.println("--------------------------------------------------------");

    }
}}
