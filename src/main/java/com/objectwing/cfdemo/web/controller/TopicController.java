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
public class TopicController {
    private Logger log = Logger.getLogger(getClass());

    //@Autowired  private PersonService personService;

    public static final String TOPIC_ENTRY_URL = "/topic";    
    public static final String TOPIC_MYTOPICS_URL = "/topic/mytopics";
    public static final String TOPIC_FOLLOW_URL = "/topic/follow/{id}";
    public static final String TOPIC_UNFOLLOW_URL = "/topic/unfollow/{id}";
    

    @ResponseBody
    @RequestMapping(value = TOPIC_MYTOPICS_URL, method = RequestMethod.GET)
    public List<HashMap<String,Object>> getMyTopics(){
    		
    	
    	/*Response
    	 * [
    	 * 	{
    	 * 		categoryId:Integer
    	 * 		title:String
    	 * 		description: String, 		
    	 * 		topics: [{
    	 * 			topicId: Integer,
    	 * 			title: String,
    	 * 			description: String,
    	 * 			follow: String Y/N,
    	 * 		}]
    	 * 	},    	 
    	 * ]
    	 */
    
    	
    	return null;
       
    }
    
    
    
    @ResponseBody
    @RequestMapping(value = TOPIC_FOLLOW_URL, method = RequestMethod.POST)
    public HashMap<String,Object> followTopic(@PathVariable  Integer id) {
    	
    	
    	/*
    	 *Response
    	 *{
    	 *		topicId:Integer
    	 *}
    	 * 
    	 */    	
    	
        return null;
    }
    
    @ResponseBody
    @RequestMapping(value = TOPIC_UNFOLLOW_URL, method = RequestMethod.POST)
    public HashMap<String,Object> unfollowTopic(@PathVariable  Integer id) {
    	
    	
    	/*
    	 *Response
    	 *{
    	 *		topicId:Integer
    	 *}
    	 * 
    	 */    	
    	
        return null;
    }
    
   
   
}