package com.objectwing.cfdemo.web.config;

import java.util.HashMap;

import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.WebSecurityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.objectwing.cfdemo.service.config.ServiceConfig;

@Configuration
@EnableWebMvc
@Import(ServiceConfig.class)
@ComponentScan("com.objectwing.cfdemo.web.controller")
public class WebConfig extends WebMvcConfigurerAdapter {

	@Autowired
	private WebSecurityManager securityManager;

	@Bean
	public InternalResourceViewResolver internalResourceViewResolver() {
		InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
		internalResourceViewResolver.setViewClass(JstlView.class);
		internalResourceViewResolver.setPrefix("/WEB-INF/views/");
		internalResourceViewResolver.setSuffix(".jsp");
		return internalResourceViewResolver;
	}

	@Bean
	public MessageSource messageSource() {
		String[] baseNames = "messages".split(",");
		ResourceBundleMessageSource resourceBundleMessageSource = new ResourceBundleMessageSource();
		resourceBundleMessageSource.setBasenames(baseNames);
		return resourceBundleMessageSource;
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/web/**").addResourceLocations("/web/");
	}

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("reading");
		registry.addViewController("/logon").setViewName("login");
		registry.addViewController("/myReading").setViewName("myReading");
	}

	@Override
	public void configureDefaultServletHandling(
			DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

	
	@Bean
	public ShiroFilterFactoryBean shiroFilter() {

		ShiroFilterFactoryBean shiroFilter = new ShiroFilterFactoryBean();
		shiroFilter.setLoginUrl("/logon");
		shiroFilter.setSuccessUrl("/");

		HashMap<String, String> filterMap = new HashMap<String, String>();

		filterMap.put("/*", "anon");
		filterMap.put("/", "authc");

		shiroFilter.setFilterChainDefinitionMap(filterMap);

		shiroFilter.setSecurityManager(securityManager);

		return shiroFilter;

	}

}
