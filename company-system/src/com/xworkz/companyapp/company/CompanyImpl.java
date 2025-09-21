package com.xworkz.companyapp.company;

import com.xworkz.companyapp.constants.CompanyName;
import com.xworkz.companyapp.project.Project;
import com.xworkz.companyapp.projectvalidator.ProjectValidator;

public class CompanyImpl implements Company {

    public CompanyImpl(int size){
        projects = new Project[size];
    }
    ProjectValidator validator = new ProjectValidator();

   public Project[] projects ;
    int index;

    @Override
    public boolean addProject(Project project) {
        boolean isProjectAdded = false;

        if (project != null) {
            if (validator.isProjectValidated(project)) {
                projects[index++] = project;
                isProjectAdded = true;
            }
        }else System.out.println("invalid project");
        return isProjectAdded;
    }

@Override
    public void getAllProjectDetails(){
        System.out.println("the project list are :");
        for (Project project : projects){
        System.out.println("the id of the project is  "+project.getProjectId());
        System.out.println("the company name of the project is  "+project.getCompanyName());
        System.out.println("the name of the project is  "+project.getProjectName());
        System.out.println("the no of members of the project is  "+project.getNoOfMembers());
        System.out.println("the no of developer of the project is  "+project.getNoOfDeveloper());
        System.out.println("--------------------------------------------------------------------");

    }
}
@Override
    public CompanyName getCompanyNameByProjectId(int projectId){
        CompanyName name = null;
        if(projectId != 0){
            for(Project project : projects ){
                if(project.getProjectId() == projectId){
                    name = project.getCompanyName();
                }
            }
        }else System.out.println("enter valid ID");
        if(name == null) System.out.println("ID not found");
        return name;
    }
    @Override
    public CompanyName getCompanyNameByProjectName(String projectName){
        CompanyName name = null;
        if(projectName != null){
            for(Project project : projects){
                if(project.getProjectName().equals(projectName)){
                    name = project.getCompanyName();
                }
            }
        }else System.out.println("enter valid name");
        if(name == null) System.out.println("name not found");
        return name;
    }
    @Override
    public int getProjectIdByProjectName(String projectName){
        int id = 0;
        if(projectName != null){
            for(Project project : projects){
                if(project.getProjectName().equals(projectName)){
                    id = project.getProjectId();
                }
            }
        }else System.out.println("enter valid name");
        if(id == 0) System.out.println("name not found");
        return id;
    }
    @Override
    public String getProjectNameByProjectId(int projectId){
        String name = null;
        if(projectId != 0){
            for(Project project : projects){
                if(project.getProjectId() == projectId){
                    name = project.getProjectName();
                }
            }
        }else System.out.println("enter valid ID");
        if(name == null) System.out.println("ID not found");
        return name;
    }
    @Override
    public int getNoOfMembersByProjectId(int projectId){
        int members = 0;
        if(projectId != 0){
            for(Project project : projects){
                if(project.getProjectId() == projectId){
                    members = project.getNoOfMembers();
                }
            }
        }else System.out.println("enter valid ID");
        if(members == 0) System.out.println("ID not found");
        return members;
    }
    @Override
    public int getNoOfMembersByProjectName(String projectName){
        int members = 0;
        if(projectName != null){
            for(Project project : projects){
                if(project.getProjectName().equals(projectName)){
                    members = project.getNoOfMembers();
                }
            }
        }else System.out.println("enter valid name");
        if(members == 0) System.out.println("name not found");
        return members;
    }
    @Override
    public int getNoOfDeveloperByProjectId(int projectId){
        int developers = 0;
        if(projectId != 0){
            for(Project project : projects){
                if(project.getProjectId() == projectId){
                    developers = project.getNoOfDeveloper();
                }
            }
        }else System.out.println("enter valid ID");
        if(developers == 0) System.out.println("ID not found");
        return developers;
    }
    @Override
    public int getNoOfDeveloperByProjectName(String projectName){
        int developers = 0;
        if(projectName != null){
            for(Project project : projects){
                if(project.getProjectName().equals(projectName)){
                    developers = project.getNoOfDeveloper();
                }
            }
        }else System.out.println("enter valid name");
        if(developers == 0) System.out.println("name not found");
        return developers;
    }
@Override
    public boolean updateCompanyNameByProjectId(int projectId, CompanyName newCompanyName){
        boolean isUpdated = false;
        if(projectId != 0){
            for(Project project : projects){
                if(project.getProjectId() == projectId){
                    project.setCompanyName(newCompanyName);
                    isUpdated = true;
                }
            }
        }else System.out.println("enter correct id");
        return isUpdated;
    }
    @Override
    public boolean updateCompanyNameByProjectName(String projectName, CompanyName newCompanyName){
        boolean isUpdated = false;
        if(projectName != null){
            for(Project project : projects){
                if(project.getProjectName().equals(projectName)){
                    project.setCompanyName(newCompanyName);
                    isUpdated = true;
                }
            }
        }else System.out.println("enter correct name");
        return isUpdated;
    }
    @Override
    public boolean updateProjectNameByProjectId(int projectId, String newProjectName){
        boolean isUpdated = false;
        if(projectId != 0){
            for(Project project : projects){
                if(project.getProjectId() == projectId){
                    project.setProjectName(newProjectName);
                    isUpdated = true;
                }
            }
        }else System.out.println("enter correct id");
        return isUpdated;
    }
    @Override
    public boolean updateNoOfMembersByProjectId(int projectId, int newNoOfMembers){
        boolean isUpdated = false;
        if(projectId != 0){
            for(Project project : projects){
                if(project.getProjectId() == projectId){
                    project.setNoOfMembers(newNoOfMembers);
                    isUpdated = true;
                }
            }
        }else System.out.println("enter correct id");
        return isUpdated;
    }
    @Override
    public boolean updateNoOfDeveloperByProjectId(int projectId, int newNoOfDeveloper){
        boolean isUpdated = false;
        if(projectId != 0){
            for(Project project : projects){
                if(project.getProjectId() == projectId){
                    project.setNoOfDeveloper(newNoOfDeveloper);
                    isUpdated = true;
                }
            }
        }else System.out.println("enter correct id");
        return isUpdated;
    }
@Override
   public Project getProjectDetailsByid(int id){

        Project project = null;
        if(id != 0){
            for (Project project1 : projects){
                if (project1.getProjectId() == id){
                    project = project1;
                }
            }
        }
        if (project == null) System.out.println("project is not available");
       return project;
   }
@Override
   public void fetchProjectDetails(Project project){

           System.out.println("the id of the project is  "+project.getProjectId());
           System.out.println("the company name of the project is  "+project.getCompanyName());
           System.out.println("the name of the project is  "+project.getProjectName());
           System.out.println("the no of members of the project is  "+project.getNoOfMembers());
           System.out.println("the no of developer of the project is  "+project.getNoOfDeveloper());
           System.out.println("--------------------------------------------------------------------");


   }


    @Override
    public int size() {
        return projects.length;
    }
}

