package com.adobe.aem.guides.mysite.core.models;

import java.util.ArrayList;
import java.util.List;

import javax.jcr.Node;
import javax.jcr.NodeIterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.adobe.cq.sightly.WCMUsePojo;

public class ProfileProjectsService extends WCMUsePojo {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private List<ProfileProjects> projectItems = new ArrayList<ProfileProjects>();

    @Override
    public void activate() throws Exception {
        // This is getting the profile node in content
        Node profile = getResource().adaptTo(Node.class);

        // next getting to projects in profile
        NodeIterator ni = profile.getNodes();

        //iterating through nodes
        while(ni.hasNext()) {
            //getting to projects node
            Node projects = ni.nextNode();

            //getting all child nodes of projects
            NodeIterator ni2 = projects.getNodes();

            setProjectFieldItems(ni2);
        }
    }

    private void setProjectFieldItems(NodeIterator ni2) {
        //iterate through child nodes of projects
        try {
            while(ni2.hasNext()) {
                //get grandchildnode
                Node item = ni2.nextNode();
                logger.info("GrandChild Path is " + item.getPath());
                //Converting Node objects to ProjectProfile Objects
                ProfileProjects pp = new ProfileProjects();
                String projectName = item.getProperty("projectName").getString();
                pp.setProjectName(projectName);
                String roles = item.getProperty("roles").getString();
                pp.setRolesAndResponsibilities(roles);

                projectItems.add(pp);
            }
            
        } catch (Exception e) {
            logger.error("some exception occurred", e.getMessage());
        }
    }

}

