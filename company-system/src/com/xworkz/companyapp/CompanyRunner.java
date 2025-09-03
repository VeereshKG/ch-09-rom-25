package com.xworkz.companyapp;

import com.xworkz.companyapp.company.Company;
import com.xworkz.companyapp.project.Project;

public class CompanyRunner {
    public static void main(String[] args) {

        Project project1= new Project(1,"wipro","E-commerce",15,8);
        Project project2 = new Project(2,"wellscargo","billing",20,10);
        Project project3=new Project(3,"Infosys","Banking",25,12);
        Project project4=new Project(4,"TCS","Healthcare",18,9);
        Project project5=new Project(5,"Accenture","ERP System",30,15);
        Project project6=new Project(6,"Capgemini","CRM",22,11);
        Project project7=new Project(7,"TechMahindra","Travel App",16,7);
        Project project8=new Project(8,"HCL","Education",28,14);
        Project project9=new Project(9,"Mindtree","Retail App",19,8);
        Project project10=new Project(10,"L&T","Insurance",24,12);
        Project project11=new Project(11,"Dell","Cloud System",27,13);
        Project project12=new Project(12,"HP","AI Model",21,9);
        Project project13=new Project(13,"IBM","Blockchain",32,16);
        Project project14=new Project(14,"Oracle","Database",29,14);
        Project project15=new Project(15,"Cisco","Networking",26,11);
        Project project16=new Project(16,"Google","Search Engine",40,20);
        Project project17=new Project(17,"Microsoft","Office Suite",38,19);
        Project project18=new Project(18,"Amazon","AWS Cloud",45,22);
        Project project19=new Project(19,"Flipkart","E-commerce",34,17);
        Project project20=new Project(20,"Paytm","Wallet App",23,10);


        Company company=new Company();

        company.addProject(project1);
        company.addProject(project2);
        company.addProject(project3);
        company.addProject(project4);
        company.addProject(project5);
        company.addProject(project6);
        company.addProject(project7);
        company.addProject(project8);
        company.addProject(project9);
        company.addProject(project10);
        company.addProject(project11);
        company.addProject(project12);
        company.addProject(project13);
        company.addProject(project14);
        company.addProject(project15);
        company.addProject(project16);
        company.addProject(project17);
        company.addProject(project18);
        company.addProject(project19);
        company.addProject(project20);

        company.getAllProjectDetails();
    }
}
