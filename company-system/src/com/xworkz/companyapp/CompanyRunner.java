package com.xworkz.companyapp;

import com.xworkz.companyapp.company.Company;
import com.xworkz.companyapp.company.CompanyImpl;
import com.xworkz.companyapp.constants.CompanyName;
import com.xworkz.companyapp.project.Project;

import java.util.Scanner;

public class CompanyRunner {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of projects to be add : ");
        int size = scanner.nextInt();
        Company company = new CompanyImpl(size);
        System.out.println("the projects available are : "+company.size());

        for (int index = 0; index<size; index++){
            Project project = new Project();

            System.out.println("the project Id :");
            project.setProjectId(scanner.nextInt());

            System.out.println("Enter project name :");
            project.setProjectName(scanner.next());

            System.out.println("Enter companyName ");
            project.setCompanyName(CompanyName.valueOf(scanner.next().toUpperCase()));

            System.out.println("Enter no of members :");
            project.setNoOfMembers(scanner.nextInt());

            System.out.println("Enter no of devlopers :");
            project.setNoOfDeveloper(scanner.nextInt());

            company.addProject(project);
        }

        company.getAllProjectDetails();



            System.out.println("enter project Id to get company name");
            System.out.println("the CompanyName of project is  "+company.getCompanyNameByProjectId(scanner.nextInt()));

            System.out.println("enter project name to get company name");
            System.out.println("the CompanyName of project is  "+company.getCompanyNameByProjectName(scanner.next()));

            System.out.println("enter project name ");
            System.out.println("the Id of project is  "+company.getProjectIdByProjectName(scanner.next()));

            System.out.println("enter project Id ");
            System.out.println("the name of project is  "+company.getProjectNameByProjectId(scanner.nextInt()));

            System.out.println("enter project Id ");
            System.out.println("the members of project is  "+company.getNoOfMembersByProjectId(scanner.nextInt()));

            System.out.println("enter project name ");
            System.out.println("the members of project is  "+company.getNoOfMembersByProjectName(scanner.next()));


            System.out.println("enter project name ");
            System.out.println("the developers of project is  "+company.getNoOfDeveloperByProjectName(scanner.next()));

            System.out.println("enter project Id ");
            System.out.println("the CompanyName of project is  "+company.getNoOfDeveloperByProjectId(scanner.nextInt()));



            System.out.println("enter project id");
            int projectId = scanner.nextInt();
            System.out.println("enter new CompanyName from TCS, INFOSYS, WIPRO, ACCENTURE, COGNIZANT");
            CompanyName companyName = CompanyName.valueOf(scanner.next().toUpperCase());
            company.updateCompanyNameByProjectId(projectId, companyName);

                company.getAllProjectDetails();

            System.out.println("enter project name");
            String projectName = scanner.next();
            System.out.println("enter new CompanyName from TCS, INFOSYS, WIPRO, ACCENTURE, COGNIZANT");
            CompanyName companyName1 = CompanyName.valueOf(scanner.next().toUpperCase());
            company.updateCompanyNameByProjectName(projectName, companyName1);
                company.getAllProjectDetails();


            System.out.println("enter project id");
            int projectId1 = scanner.nextInt();
            System.out.println("enter new Project Name");
            String newProjectName = scanner.next();
            company.updateProjectNameByProjectId(projectId1, newProjectName);
                company.getAllProjectDetails();


            System.out.println("enter project id");
            int projectId2 = scanner.nextInt();
            System.out.println("enter new No. of Members");
            int newNoOfMembers = scanner.nextInt();
            company.updateNoOfMembersByProjectId(projectId2, newNoOfMembers);
                company.getAllProjectDetails();

            System.out.println("enter project id");
            int projectId3 = scanner.nextInt();
            System.out.println("enter new No. of Developers");
            int newNoOfDeveloper = scanner.nextInt();
            company.updateNoOfDeveloperByProjectId(projectId3, newNoOfDeveloper);
                company.getAllProjectDetails();

        System.out.println("Enter id to get project detaild");
        int id = scanner.nextInt();
        Project project = company.getProjectDetailsByid(id);


        company.fetchProjectDetails(project);


    }
}
