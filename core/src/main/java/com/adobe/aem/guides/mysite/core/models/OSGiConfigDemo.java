package com.adobe.aem.guides.mysite.core.models;


import java.util.List;

import com.adobe.aem.guides.mysite.core.services.OSGiFactoryConfig;

public interface OSGiConfigDemo {
    
    public String getServiceName();
    public int getServiceCount();
    public boolean isLiveData();
    public String[] getCountries() ;
    public String getRunModes();
    

    
    public int getServiceId();
    public String getServiceNameModule() ;
    public String getServiceURL() ;


    
    public List<OSGiFactoryConfig> getAllOSGiConfigs();
    
}
