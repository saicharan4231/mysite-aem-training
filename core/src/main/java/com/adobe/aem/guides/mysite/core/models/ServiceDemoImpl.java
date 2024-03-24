package com.adobe.aem.guides.mysite.core.models;

import com.adobe.aem.guides.mysite.core.services.DemoService;
import com.adobe.aem.guides.mysite.core.services.DemoServiceB;
import com.adobe.aem.guides.mysite.core.services.MultiService;
import com.day.cq.wcm.api.Page;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Iterator;
import java.util.List;

@Model(adaptables = SlingHttpServletRequest.class,
adapters = ServiceDemo.class,
defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ServiceDemoImpl  implements ServiceDemo {
    private static final Logger LOG= LoggerFactory.getLogger(ServiceDemoImpl.class);


    @OSGiService
    DemoService demoService;

    /*@Inject*/
    @OSGiService
    DemoServiceB demoServiceB;


    @Override
    public Iterator<Page> getPagesList(){
        LOG.info("\n ==============Calling ServiceDemoImpl getPagesList()================");
        return demoService.getPages();
    }

    @Override
    public List<String> getPageTitleList() {
        return demoServiceB.getPages();
    }
    

    
    @OSGiService(filter = "(component.name=serviceA)")
    MultiService multiService;

    @OSGiService(filter = "(component.name=com.adobe.aem.guides.mysite.core.services.impl.MultiServiceBImpl)")
    MultiService multiServiceB;

    @Override
    public String getNameFromService() {
        return multiService.getName();
    }

    @Override
    public String getNameFromServiceB() {
        return multiServiceB.getName();
    }
    @Override
    public String getNameWithReference() {
        return demoServiceB.getNameWithReference();
    }
    
}
