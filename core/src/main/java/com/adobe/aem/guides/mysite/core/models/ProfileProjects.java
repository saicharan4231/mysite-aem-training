package com.adobe.aem.guides.mysite.core.models;

public class ProfileProjects {

    private String projectName;

    private String rolesAndResponsibilities;


    /**
     * @return String return the projectName
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * @param projectName the projectName to set
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }


    /**
     * @return String return the rolesAndResponsibilities
     */
    public String getRolesAndResponsibilities() {
        return rolesAndResponsibilities;
    }

    /**
     * @param rolesAndResponsibilities the rolesAndResponsibilities to set
     */
    public void setRolesAndResponsibilities(String rolesAndResponsibilities) {
        this.rolesAndResponsibilities = rolesAndResponsibilities;
    }

}
