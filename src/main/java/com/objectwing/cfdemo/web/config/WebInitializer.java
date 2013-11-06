package com.objectwing.cfdemo.web.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.DelegatingFilterProxy;
import org.springframework.web.servlet.DispatcherServlet;

import com.objectwing.cfdemo.service.config.ServiceConfig;

public class WebInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext container) {

		// Create the 'root' Spring application context
		AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
		rootContext.register(ServiceConfig.class,SecurityConfig.class);
		rootContext.refresh();

		// Manage the lifecycle of the root application context
		container.addListener(new ContextLoaderListener(rootContext));
		
		
		// Create the dispatcher servlet's Spring application context
		AnnotationConfigWebApplicationContext dispatcherContext = new AnnotationConfigWebApplicationContext();
		dispatcherContext.setServletContext(container);
		dispatcherContext.setParent(rootContext);
		dispatcherContext.register(WebConfig.class);

		// Register and map the dispatcher servlet
		ServletRegistration.Dynamic dispatcher = container.addServlet(
				"dispatcher", new DispatcherServlet(dispatcherContext));
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("/");

		container
				.addFilter(
						"shiroFilter",
						new DelegatingFilterProxy("shiroFilter",
								dispatcherContext)).addMappingForUrlPatterns(
						null, false, "/*");

	}
}
