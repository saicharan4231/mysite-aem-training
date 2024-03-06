package com.myproject.aem.core.models.impl;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Required;

import com.myproject.aem.core.models.Profile;

@Model(adaptables = Resource.class, 
        adapters = Profile.class, 
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ProfileSlingModel implements Profile {

    @Inject
    @Required
    private String firstName;

    @Inject
    @Required
    private String lastName;

    @Inject
    private String profileDesc;

    @Inject
    private Long age;

    @Inject
    private String department;

    @Inject
    public Resource projects;

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String getProfileDesc() {
        return this.profileDesc;
    }

    @Override
    public Long getAge() {
        return this.age;
    }

    @Override
    public String getDepartment() {
        return this.department;
    }

}

