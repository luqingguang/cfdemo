/*
 * Licensed Materials - Property of IBM
 * (C) Copyright IBM Corp. 2012, 2012 All Rights Reserved
 * US Government Users Restricted Rights - Use, duplication or 
 * disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
 */

package com.objectwing.cfdemo.util;

import java.io.Serializable;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * The UserPrinciple class used to store current user info in session.
 * 
 * @version 1.0 September 30, 2012.
 * @author Qing Guang Lu
 */
public class UserPrinciple implements Serializable {
	
	private static final long serialVersionUID = -1L;
	
	/** user id */
	private Integer id;
	
	/** user login name */
	private String loginName;
	
	/** user name */
	private String name;
	
		
	
	/**
	 * get user id
	 * 
	 * @return
	 */
	public Integer getId() {
		return id;
	}
	
	/**
	 * set user id
	 * 
	 * @param id
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	
	/**
	 * get user login name
	 * 
	 * @return
	 */
	public String getLoginName() {
		return loginName;
	}
	
	/**
	 * set user login name
	 * 
	 * @param loginName
	 */
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	
	/**
	 * get user name
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * set user name
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
}
