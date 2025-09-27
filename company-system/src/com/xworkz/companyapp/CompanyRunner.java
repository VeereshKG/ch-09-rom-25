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
        System.out.println("the projects available are : " + company.size());
        boolean isAdded = false;
        for (int index = 0; index < size; index++) {
            Project project = new Project();

            System.out.println("the project Id :");
            project.setProjectId(scanner.nextInt());

            System.out.println("Enter project name :");
            project.setProjectName(scanner.next());

            System.out.println("Enter companyName from TCS, INFOSYS, WIPRO, ACCENTURE, COGNIZANT");
            project.setCompanyName(CompanyName.valueOf(scanner.next().toUpperCase()));

            System.out.println("Enter no of members :");
            project.setNoOfMembers(scanner.nextInt());

            System.out.println("Enter no of devlopers :");
            project.setNoOfDeveloper(scanner.nextInt());

          isAdded =  company.addProject(project);
        }

        if (isAdded == true) {
            String input = null;
            do {
                System.out.println("press 1 to get company name by project id");
                System.out.println("press 2 to get company name by project name");
                System.out.println("press 3 to get project id by project name");
                System.out.println("press 4 to get project name by project id");
                System.out.println("press 5 to get no Of members by project id");
                System.out.println("press 6 to get no Of members by project name");
                System.out.println("press 7 to get no Of developers by project name");
                System.out.println("press 8 to get no Of developers by project id");
                System.out.println("press 9 to update company name by project id");
                System.out.println("press 10 to update company name by project name ");
                System.out.println("press 11 to update project name by project id");
                System.out.println("press 12 to update NoOfMembers  by project id");
                System.out.println("press 13 to update NoOfDevelopers  by project id");
                System.out.println("press 14 to get Project details by project id");
                System.out.println("press 15 to get AllProjectDetails");

                int option = scanner.nextInt();
                switch (option) {

                    case 1:
                        System.out.println("enter project Id to get company name");
                        System.out.println("the CompanyName of project is  " + company.getCompanyNameByProjectId(scanner.nextInt()));
                        break;
                    case 2:
                        System.out.println("enter project name to get company name");
                        System.out.println("the CompanyName of project is  " + company.getCompanyNameByProjectName(scanner.next()));
                    case 3:
                        System.out.println("enter project name to get project id");
                        System.out.println("the Id of project is  " + company.getProjectIdByProjectName(scanner.next()));
                        break;
                    case 4:
                        System.out.println("enter project Id to get project name");
                        System.out.println("the name of project is  " + company.getProjectNameByProjectId(scanner.nextInt()));
                        break;
                    case 5:
                        System.out.println("enter project Id to get NoOfMembers");
                        System.out.println("the members of project is  " + company.getNoOfMembersByProjectId(scanner.nextInt()));
                        break;
                    case 6:
                        System.out.println("enter project name to getNoOfMembers");
                        System.out.println("the members of project is  " + company.getNoOfMembersByProjectName(scanner.next()));
                        break;
                    case 7:

                        System.out.println("enter project name to get NoOfDeveloper");
                        System.out.println("the developers of project is  " + company.getNoOfDeveloperByProjectName(scanner.next()));
                        break;
                    case 8:
                        System.out.println("enter project Id to get NoOfDeveloper");
                        System.out.println("the CompanyName of project is  " + company.getNoOfDeveloperByProjectId(scanner.nextInt()));
                        break;
                    case 9:
                        System.out.println("enter project id to update CompanyName");
                        int projectId = scanner.nextInt();
                        System.out.println("enter new CompanyName from TCS, INFOSYS, WIPRO, ACCENTURE, COGNIZANT");
                        CompanyName companyName = CompanyName.valueOf(scanner.next().toUpperCase());
                        boolean isCompanyNameUpdated = company.updateCompanyNameByProjectId(projectId, companyName);
                        System.out.println("company name is updated:" + isCompanyNameUpdated);
                        break;
                    case 10:
                        System.out.println("enter project name to update CompanyName");
                        String projectName = scanner.next();
                        System.out.println("enter new CompanyName from TCS, INFOSYS, WIPRO, ACCENTURE, COGNIZANT");
                        CompanyName companyName1 = CompanyName.valueOf(scanner.next().toUpperCase());
                        boolean isCompanyNameUpdated1 = company.updateCompanyNameByProjectName(projectName, companyName1);
                        System.out.println("company name is updated:" + isCompanyNameUpdated1);
                        break;
                    case 11:
                        System.out.println("enter project id to update ProjectName");
                        int projectId1 = scanner.nextInt();
                        System.out.println("enter new Project Name");
                        String newProjectName = scanner.next();
                        boolean isProjectNameUpdate = company.updateProjectNameByProjectId(projectId1, newProjectName);
                        System.out.println("project name is updated :" + isProjectNameUpdate);
                        break;
                    case 12:
                        System.out.println("enter project id to update NoOfMembers");
                        int projectId2 = scanner.nextInt();
                        System.out.println("enter new No. of Members");
                        int newNoOfMembers = scanner.nextInt();
                        boolean isNoOfMembersUpdated = company.updateNoOfMembersByProjectId(projectId2, newNoOfMembers);
                        System.out.println("no of members are updated:" + isNoOfMembersUpdated);
                        break;
                    case 13:
                        System.out.println("enter project id to update NoOfDeveloper");
                        int projectId3 = scanner.nextInt();
                        System.out.println("enter new No. of Developers");
                        int newNoOfDeveloper = scanner.nextInt();
                        boolean isNoOfDevelopersUpdated = company.updateNoOfDeveloperByProjectId(projectId3, newNoOfDeveloper);
                        System.out.println("No of developers are updated:" + isNoOfDevelopersUpdated);
                        break;
                    case 14:
                        System.out.println("Enter id to get project details");
                        int id = scanner.nextInt();
                        Project project = company.getProjectDetailsByid(id);
                        company.fetchProjectDetails(project);
                        break;
                    case 15:
                        company.getAllProjectDetails();
                        break;
                    default:
                        System.out.println("enter the option correctly");
                }
                System.out.println("do you want to continue yes/no");
                input = scanner.next();
            } while (input.equalsIgnoreCase("yes"));
            System.out.println("thank you..visit again");
        } else System.out.println("Project not added");
    }
}
