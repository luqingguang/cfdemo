package com.objectwing.cfdemo.web.controller;

import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.objectwing.cfdemo.service.PersonService;

import java.util.Date;
import java.util.HashMap;


@Controller
public class LoginController {
	
	private Logger log = Logger.getLogger(getClass());

	@Autowired
	private PersonService personService;

	public static final String LOGIN_ENTRY_URL = "/login";

	public static final String SIGNUP_ENTRY_URL = "/signup";

	@ResponseBody
	@RequestMapping(value = LOGIN_ENTRY_URL, method = RequestMethod.POST)
	public HashMap<String, Object> login(@RequestBody HashMap<String, Object> obj) {

		/*
		 * request { 
		 * 		loginName:String, 
		 * 		password:String 
		 * } 
		 * 
		 * response {
		 * 		success:String Y/N
		 * 		message:String 
		 * }
		 */

		String loginName = (String)obj.get("loginName");		
		String password = (String)obj.get("password");
		
		UsernamePasswordToken token = new UsernamePasswordToken(loginName,
				password);

		Subject currentUser = SecurityUtils.getSubject();

		HashMap<String, Object> result = new HashMap<String, Object>();

		try {

			// login
			currentUser.login(token);			

			// set result
			result.put("success", "Y");

			return result;

		}catch(Exception e){
			
			result.put("success", "Y");			
			result.put("message", e.getMessage());		

			return result;
			
		}

	}

	@ResponseBody
	@RequestMapping(value = SIGNUP_ENTRY_URL, method = RequestMethod.POST)
	public HashMap<String, Object> signup(@RequestBody HashMap<String, Object> obj) {
		/*
		 * request { name:String loginName:String, password:String } response {
		 * success:String Y/N message:String }
		 */

		String loginName = (String)obj.get("loginName");		
		String password = (String)obj.get("password");
		
		Date signupDate = new Date();
		
		personService.createPerson(null, loginName, password, signupDate);		
		
		UsernamePasswordToken token = new UsernamePasswordToken(loginName,
				password);

		Subject currentUser = SecurityUtils.getSubject();

		HashMap<String, Object> result = new HashMap<String, Object>();

		try {

			// login
			currentUser.login(token);			

			// set result
			result.put("success", "Y");

			return result;

		}catch(Exception e){
			
			result.put("success", "Y");			
			result.put("message", e.getMessage());		

			return result;
			
		}


	}

}