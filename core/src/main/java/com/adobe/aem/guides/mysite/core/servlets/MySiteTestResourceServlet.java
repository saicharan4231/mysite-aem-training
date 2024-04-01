package com.adobe.aem.guides.mysite.core.servlets;

import java.io.IOException;


import javax.servlet.Servlet;
import javax.servlet.ServletException;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.servlets.HttpConstants;


import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletResourceTypes;
import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.day.cq.commons.jcr.JcrConstants;


@Component(service = Servlet.class)
@SlingServletResourceTypes(
		resourceTypes="mysite/components/page",
		methods= {HttpConstants.METHOD_GET, HttpConstants.METHOD_POST},
		selectors= {"mysite","test"},
		extensions = {"txt","json"})
public class MySiteTestResourceServlet extends SlingAllMethodsServlet {
	public static final Logger LOG= LoggerFactory.getLogger(MySiteTestResourceServlet.class);
	
	protected void doGet(final SlingHttpServletRequest req, final SlingHttpServletResponse resp) throws 
	ServletException, IOException{

		final Resource resource = req.getResource();
		
		resp.setContentType("text/plain");
		resp.getWriter().write("Page Title = "+ resource.getValueMap().get(JcrConstants.JCR_TITLE));
    }
    	
	protected void doPost(final SlingHttpServletRequest req, final SlingHttpServletResponse resp) throws 
	ServletException, IOException{
		
		String name = req.getParameter("name");
		LOG.info("\n====Parameters======>  {}", name);
		resp.getWriter().write("Hi "+ name);

	}
	
}
