package com.adobe.aem.guides.mysite.core.models;

import org.apache.sling.api.resource.Resource;

public interface Profile {

    public String getFirstName();

    public String getLastName();

    public String getProfileDescription();

    public Long getAge();

    public String getDepartment();

    public String[] getSkills();

    public Resource getProjects();

}
