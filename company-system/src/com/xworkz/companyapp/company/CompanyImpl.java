package com.xworkz.companyapp.company;

import com.xworkz.companyapp.constants.CompanyName;
import com.xworkz.companyapp.exception.*;
import com.xworkz.companyapp.project.Project;
import com.xworkz.companyapp.projectvalidator.ProjectValidator;

public class CompanyImpl implements Company {

    public CompanyImpl(int size) {
        projects = new Project[size];
    }

    ProjectValidator validator = new ProjectValidator();

    public Project[] projects;
    int index;

    @Override
    public boolean addProject(Project project) {
        boolean isProjectAdded = false;
        try {
            if (validator.isProjectValidated(project)) {
                projects[index++] = project;
                isProjectAdded = true;
            } else {
                ProjectNotAddException projectNotAddException = new ProjectNotAddException("invalid project");
                throw projectNotAddException;
            }
        } catch (ProjectNotAddException e) {
            e.printStackTrace();
        }

        return isProjectAdded;
    }

    @Override
    public void getAllProjectDetails() {
        System.out.println("the project list are :");
        for (Project project : projects) {
            System.out.println("the id of the project is  " + project.getProjectId());
            System.out.println("the company name of the project is  " + project.getCompanyName());
            System.out.println("the name of the project is  " + project.getProjectName());
            System.out.println("the no of members of the project is  " + project.getNoOfMembers());
            System.out.println("the no of developer of the project is  " + project.getNoOfDeveloper());
            System.out.println("--------------------------------------------------------------------");

        }
    }

    @Override
    public CompanyName getCompanyNameByProjectId(int projectId) {
        CompanyName name = null;
        try {
            if (projectId != 0) {
                for (Project project : projects) {
                    if (project.getProjectId() == projectId) {
                        name = project.getCompanyName();
                    }
                }
            } else System.out.println("enter valid ID");
            if (name == null) {
                CompanyNameNotFoundException exception = new CompanyNameNotFoundException("Company name not available");
                throw exception;
            }
        } catch (CompanyNameNotFoundException e) {
            e.printStackTrace();
        }
        return name;
    }

    @Override
    public CompanyName getCompanyNameByProjectName(String projectName) {
        CompanyName name = null;
        try {

            if (projectName != null) {
                for (Project project : projects) {
                    if (project.getProjectName().equals(projectName)) {
                        name = project.getCompanyName();
                    }
                }
            } else System.out.println("enter valid name");
            if (name == null) {
                CompanyNameNotFoundException companyNameNotFountException = new CompanyNameNotFoundException("Company name not found");
                throw companyNameNotFountException;
            }
        } catch (CompanyNameNotFoundException e) {
            e.printStackTrace();
        }
        return name;
    }

    @Override
    public int getProjectIdByProjectName(String projectName) {
        int id = 0;
        try {
            if (projectName != null) {
                for (Project project : projects) {
                    if (project.getProjectName().equals(projectName)) {
                        id = project.getProjectId();
                    }
                }
            }
            if (id == 0) {
                IdNotFoundException idNotFoundException = new IdNotFoundException("id not found");
                throw idNotFoundException;
            }
        } catch (IdNotFoundException e) {
            e.printStackTrace();
        }
        return id;
    }

    @Override
    public String getProjectNameByProjectId(int projectId) {
        String name = null;
        try {
            if (projectId != 0) {
                for (Project project : projects) {
                    if (project.getProjectId() == projectId) {
                        name = project.getProjectName();
                    }
                }
            }
            if (name == null) {
                ProjectNameNotFountException projectNameNotFountException = new ProjectNameNotFountException("Project name not found");
                throw projectNameNotFountException;
            }
        } catch (ProjectNameNotFountException e) {
            e.printStackTrace();
        }
        return name;
    }

    @Override
    public int getNoOfMembersByProjectId(int projectId) {
        int members = 0;
        try {
            if (projectId != 0) {
                for (Project project : projects) {
                    if (project.getProjectId() == projectId) {
                        members = project.getNoOfMembers();
                    }
                }
            }
            if (members == 0) {
                MembersNotFoundException membersNotFoundException = new MembersNotFoundException("no of members not found");
                throw membersNotFoundException;
            }
        } catch (MembersNotFoundException e) {
            e.printStackTrace();
        }
        return members;
    }

    @Override
    public int getNoOfMembersByProjectName(String projectName) {
        int members = 0;
        try {
            if (projectName != null) {
                for (Project project : projects) {
                    if (project.getProjectName().equals(projectName)) {
                        members = project.getNoOfMembers();
                    }
                }
            }
            if (members == 0) {
                MembersNotFoundException membersNotFoundException = new MembersNotFoundException("no of members not found");
                throw membersNotFoundException;
            }
        } catch (MembersNotFoundException e) {
            e.printStackTrace();
        }
        return members;
    }

    @Override
    public int getNoOfDeveloperByProjectId(int projectId) {
        int developers = 0;
        try {
            if (projectId != 0) {
                for (Project project : projects) {
                    if (project.getProjectId() == projectId) {
                        developers = project.getNoOfDeveloper();
                    }
                }
            } else {
                NoOfDevelopersNotFoundException developersNotFoundException = new NoOfDevelopersNotFoundException("developers not found");
                throw developersNotFoundException;
            }
        } catch (NoOfDevelopersNotFoundException e) {
            e.printStackTrace();
        }
        return developers;
    }

    @Override
    public int getNoOfDeveloperByProjectName(String projectName) {
        int developers = 0;
        try {
            if (projectName != null) {
                for (Project project : projects) {
                    if (project.getProjectName().equals(projectName)) {
                        developers = project.getNoOfDeveloper();
                    }
                }
            } else {
                NoOfDevelopersNotFoundException developersNotFoundException = new NoOfDevelopersNotFoundException("developers not found");
                throw developersNotFoundException;
            }
        } catch (NoOfDevelopersNotFoundException e) {
            e.printStackTrace();
        }
        return developers;
    }

    @Override
    public boolean updateCompanyNameByProjectId(int projectId, CompanyName newCompanyName) {
        boolean isUpdated = false;
        try {
            if (projectId != 0) {
                for (Project project : projects) {
                    if (project.getProjectId() == projectId) {
                        project.setCompanyName(newCompanyName);
                        isUpdated = true;
                    }
                }
            } else {
                UpdateCompanyNameNotDoneException exception = new UpdateCompanyNameNotDoneException("Company name not updated");
                throw exception;
            }
        } catch (UpdateCompanyNameNotDoneException e) {
            e.printStackTrace();
        }
        return isUpdated;
    }

    @Override
    public boolean updateCompanyNameByProjectName(String projectName, CompanyName newCompanyName) {
        boolean isUpdated = false;
        try {
            if (projectName != null) {
                for (Project project : projects) {
                    if (project.getProjectName().equals(projectName)) {
                        project.setCompanyName(newCompanyName);
                        isUpdated = true;
                    }
                }
            } else {
                UpdateCompanyNameNotDoneException exception = new UpdateCompanyNameNotDoneException("Company name not updated");
                throw exception;
            }
        } catch (UpdateCompanyNameNotDoneException e) {
            e.printStackTrace();
        }
        return isUpdated;
    }

    @Override
    public boolean updateProjectNameByProjectId(int projectId, String newProjectName) {
        boolean isUpdated = false;
        try {
            if (projectId != 0) {
                for (Project project : projects) {
                    if (project.getProjectId() == projectId) {
                        project.setProjectName(newProjectName);
                        isUpdated = true;
                    }
                }
            } else {
                UpdateProjectNameNotDoneException projectNameNotDoneException = new UpdateProjectNameNotDoneException("projectname not updated");
                throw projectNameNotDoneException;
            }
        } catch (UpdateProjectNameNotDoneException e) {
            e.printStackTrace();
        }
        return isUpdated;
    }

    @Override
    public boolean updateNoOfMembersByProjectId(int projectId, int newNoOfMembers) {
        boolean isUpdated = false;
        try {
            if (projectId != 0) {
                for (Project project : projects) {
                    if (project.getProjectId() == projectId) {
                        project.setNoOfMembers(newNoOfMembers);
                        isUpdated = true;
                    }
                }
            } else {
                UpdateNoOfMembersNotDoneException noOfMembersNotDoneException = new UpdateNoOfMembersNotDoneException("no of memebers not updated");
                throw noOfMembersNotDoneException;

            }
        } catch (UpdateNoOfMembersNotDoneException e) {
            e.printStackTrace();
        }
        return isUpdated;
    }

    @Override
    public boolean updateNoOfDeveloperByProjectId(int projectId, int newNoOfDeveloper) {
        boolean isUpdated = false;
        try {
            if (projectId != 0) {
                for (Project project : projects) {
                    if (project.getProjectId() == projectId) {
                        project.setNoOfDeveloper(newNoOfDeveloper);
                        isUpdated = true;
                    }
                }
            } else {
                UpdateNoOfDevelopersNotDoneException updateNoOfDevelopersNotDoneException = new UpdateNoOfDevelopersNotDoneException("no of developer not updated");
                throw updateNoOfDevelopersNotDoneException;
            }
        } catch (UpdateNoOfDevelopersNotDoneException e) {
            e.printStackTrace();
        }
        return isUpdated;
    }

    @Override
    public Project getProjectDetailsByid(int id) {

        Project project = null;
        try {
            if (id != 0) {
                for (Project project1 : projects) {
                    if (project1.getProjectId() == id) {
                        project = project1;
                    }
                }
            }
            if (project == null) {
                ProjectDetailsNotFoundException projectDetailsNotFoundException = new ProjectDetailsNotFoundException("details not found");
                throw projectDetailsNotFoundException;
            }
        } catch (ProjectDetailsNotFoundException e) {
            e.printStackTrace();
        }
        return project;
    }

    @Override
    public void fetchProjectDetails(Project project) {
        try {
            System.out.println("the id of the project is  " + project.getProjectId());
            System.out.println("the company name of the project is  " + project.getCompanyName());
            System.out.println("the name of the project is  " + project.getProjectName());
            System.out.println("the no of members of the project is  " + project.getNoOfMembers());
            System.out.println("the no of developer of the project is  " + project.getNoOfDeveloper());
            System.out.println("--------------------------------------------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    @Override
    public int size() {
        return projects.length;
    }
}

