package com.adobe.aem.guides.mysite.core.services.impl;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.propertytypes.ServiceRanking;

import com.adobe.aem.guides.mysite.core.services.MultiService;

@Component(service = MultiService.class,immediate = true)
@ServiceRanking(1001)
public class MultiServiceBImpl implements MultiService{

    @Override
    public String getName() {
        return "MultiServiceBImpl";
    }
}