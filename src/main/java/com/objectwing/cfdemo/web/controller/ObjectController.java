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
public class ObjectController {
    private Logger log = Logger.getLogger(getClass());

    //@Autowired  private PersonService personService;

    public static final String OBJECT_ENTRY_URL = "/object";    
    public static final String READING_ENTRY_URL = "/object/reading";
    public static final String ROADMAP_ENTRY_URL = "/object/roadmap";
    

    @ResponseBody
    @RequestMapping(value = OBJECT_ENTRY_URL, method = RequestMethod.GET)
    public List<HashMap<String,Object>> search(
    		@RequestParam("myfavorites") String myfavorites,
    		@RequestParam("mylikes") String mylikes,
    		@RequestParam("mysubmissions") String mysubmissions,
    		@RequestParam("topic") String topic,
    		@RequestParam("objectType") String objectType
    				)throws Exception {    	
    	
    	/*[
    	 * 	{
    	 * 		objectType:"reading",
    	 * 		objectId: Integer,
    	 * 		title: String,
    	 * 		description: String,
    	 * 		uri: String,
    	 * 		like: String Y/N,
    	 * 		favorite: String Y/N,
    	 * 		read: String Y/N
    	 * 	},
    	 * 	{
    	 * 		objectType:"roadmap",
    	 * 		objectId: Integer,
    	 * 		title: String,
    	 * 		description: String,
    	 * 		uri: String,
    	 * 		like: String Y/N,
    	 * 		favorite: String Y/N,
    	 * 		read: String Y/N
    	 * 		milestones: [{
    	 * 			objectType:"milestone",
    	 * 			objectId: Integer,
    	 * 			title: String,
    	 * 			description: String,
    	 * 			read: String Y/N,
    	 * 			readings[{
    	 * 				objectType:"reading",
    	 * 				objectId: Integer,
    	 * 				title: String,
    	 * 				description: String,
    	 * 				uri: String,
    	 * 				like: String Y/N,
    	 * 				favorite: String Y/N,
    	 * 				read: String Y/N
    	 * 			}]
    	 * 		}]
    	 * 	},    	 
    	 * ]
    	 */
    
    	
    	return null;
       
    }
    
    
    @ResponseBody
    @RequestMapping(value = READING_ENTRY_URL, method = RequestMethod.GET)
    public List<HashMap<String,Object>> getMyRoadmaps() {
    	
    	/*response
    	 * [{
    	 * 		roadmapId:Integer,
    	 * 		title:String,
    	 * 		description:String
    	 *  	   
    	 * }]
    	 * 
    	 */
    	
    	return null;
    }
    

    @ResponseBody
    @RequestMapping(value = READING_ENTRY_URL, method = RequestMethod.POST)
    public Integer submitReading() {
    	
    	/*request
    	 * {
    	 * 		uri:String,
    	 * 		title:String,
    	 * 		Description:String
    	 * 
    	 * }
    	 *
    	 *Response
    	 *{
    	 *		readingId:Integer
    	 *}
    	 * 
    	 */    	
    	
        return null;
    }
    
    @ResponseBody
    @RequestMapping(value = ROADMAP_ENTRY_URL, method = RequestMethod.POST)
    public Integer addReadingToRoadmap() {
    	
    	/*request
    	 * {
    	 * 		readingId:Integer
    	 * 		roadmapId:Integer/null
    	 * 		roadmapTitle:String
    	 * 		roadmapDescription:String
    	 * 		milestoneType: String Known/Skilled/Expert
    	 * 
    	 * }
    	 *
    	 *Response
    	 *{
    	 *		roadmapId:Integer
    	 *}
    	 * 
    	 */    	
    	
        return null;
    }
    
    @ResponseBody
    @RequestMapping(value = OBJECT_ENTRY_URL, method = RequestMethod.POST)
    public Integer operateObject() {
    	
    	/*request
    	 * {
    	 * 		objectType:String, roadmap/reading
    	 * 		objectId:Integer
    	 * 		operateType:String like/favorite/read    	 
    	 * 
    	 * }
    	 *
    	 *Response
    	 *{
    	 *		objectId:Integer
    	 *}
    	 * 
    	 */    	
    	
        return null;
    }

   
}