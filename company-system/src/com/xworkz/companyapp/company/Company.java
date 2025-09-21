package com.xworkz.companyapp.company;

import com.xworkz.companyapp.constants.CompanyName;
import com.xworkz.companyapp.project.Project;

public interface Company {

    int size();

    boolean addProject(Project project);

    CompanyName getCompanyNameByProjectId(int projectId);

    void getAllProjectDetails();

    int getProjectIdByProjectName(String projectName);

    CompanyName getCompanyNameByProjectName(String projectName);

    int getNoOfMembersByProjectId(int projectId);

    String getProjectNameByProjectId(int projectId);

    int getNoOfDeveloperByProjectId(int projectId);

    int getNoOfMembersByProjectName(String projectName);

    boolean updateCompanyNameByProjectId(int projectId, CompanyName newCompanyName);

    int getNoOfDeveloperByProjectName(String projectName);

    boolean updateProjectNameByProjectId(int projectId, String newProjectName);

    boolean updateCompanyNameByProjectName(String projectName, CompanyName newCompanyName);

    boolean updateNoOfDeveloperByProjectId(int projectId, int newNoOfDeveloper);

    boolean updateNoOfMembersByProjectId(int projectId, int newNoOfMembers);

    Project getProjectDetailsByid(int id);

    void fetchProjectDetails(Project project);
}
