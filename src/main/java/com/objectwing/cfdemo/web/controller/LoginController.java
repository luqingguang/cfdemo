package com.objectwing.cfdemo.web.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.objectwing.cfdemo.domain.Person;
import com.objectwing.cfdemo.service.PersonService;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Controller
public class LoginController {
    private Logger log = Logger.getLogger(getClass());

    @Autowired  private PersonService personService;
    
    public static final String LOGIN_ENTRY_URL = "/login";
    
    public static final String SIGNUP_ENTRY_URL = "/signup";
    
    @ResponseBody
    @RequestMapping(value = LOGIN_ENTRY_URL, method = RequestMethod.POST)
    public HashMap<String,Object> login() {
    	/*
    	 * request
    	 * {
    	 * 		loginName:String,
    	 * 		password:String
    	 * }
    	 * response
    	 * {
    	 * 		success:String Y/N
    	 * 		message:String
    	 * }
    	 */
    	
    	return null;
    	
    }
    
    @ResponseBody
    @RequestMapping(value = LOGIN_ENTRY_URL, method = RequestMethod.POST)
    public HashMap<String,Object> signup() {
    	/*
    	 * request
    	 * {
    	 * 		name:String
    	 * 		loginName:String,
    	 * 		password:String
    	 * }
    	 * response
    	 * {
    	 * 		success:String Y/N
    	 * 		message:String
    	 * }
    	 */
    	
    	return null;
    	
    }    
    
    
    
}