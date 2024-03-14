package com.adobe.aem.guides.mysite.core.models;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Optional;

@Model(adaptables=Resource.class, adapters=Profile.class)
public class ProfileImpl implements Profile {

    @Inject
    String firstName;

    @Inject
    String lastName;

    @Inject
    @Optional
    String profileDesc;

    @Inject
    Long age;

    @Inject
    String department;

    @Inject
    String[] skills;

    @Inject
    @Optional
    Resource projects;

    @Override
    public String getFirstName() {
        // TODO Auto-generated method stub
        return firstName;
    }

    @Override
    public String getLastName() {
        // TODO Auto-generated method stub
        return lastName;
    }

    @Override
    public String getProfileDescription() {
        // TODO Auto-generated method stub
        return profileDesc;
    }

    @Override
    public Long getAge() {
        // TODO Auto-generated method stub
        return age;
    }

    @Override
    public String getDepartment() {
        // TODO Auto-generated method stub
        return department;
    }

    @Override
    public String[] getSkills() {
        // TODO Auto-generated method stub
        return skills;
    }

    @Override
    public Resource getProjects() {
        // TODO Auto-generated method stub
        return projects;
    }

}
