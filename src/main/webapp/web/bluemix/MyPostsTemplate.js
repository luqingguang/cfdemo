/*
 * Licensed Materials - Property of IBM
 * (C) Copyright IBM Corp. 2012 All Rights Reserved
 * US Government Users Restricted Rights - Use, duplication or 
 * disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
 */
define([ "dojo/_base/declare", 
         "dojo/parser", 
         "dijit/_WidgetBase",
         "dijit/_TemplatedMixin", 
         "dijit/_WidgetsInTemplateMixin",
         "dojo/text!./resources/MyPostsTemplate.html",
         "bluemix/ReadingTemplate",
         "bluemix/RoadmapTemplate"
], 
function(declare, parser, _WidgetBase, _TemplatedMixin,_WidgetsInTemplateMixin, template) {
return declare("bluemix.MyPostsTemplate", 
			[ _WidgetBase, _TemplatedMixin,_WidgetsInTemplateMixin ], {
	
	/**
     * The path to the widget template for the dijit._Templated base class.
     * 
     * @private
     * @constant
     * @type String
     */
	templateString : template,

	/**
	 * component startup
	 */
	mixTemplate: null,
	startup : function() {
		mixTemplate = this;
		this.constructor.superclass.startup.apply(this);	
	},
	
	postCreate: function(){
		mixTemplate = this;
		this.onAllClick();
	},
	
	
	onAllClick:function(){
		require(["dojo/dom-construct"], function(domConstruct){
			
			domConstruct.empty(mixTemplate.mixContent);
			var roadMap = new bluemix.RoadmapTemplate();
			mixTemplate.mixContent.appendChild(roadMap.domNode);
			var reading = new bluemix.ReadingTemplate();
			mixTemplate.mixContent.appendChild(reading.domNode);
			
			/*dojo.xhrGet({
				url: "/object",
				headers: {"Content-Type": "application/json", "Accept": "application/json"},
			    handleAs: "json",
			    content: {
			    	mysubmissions: "mysubmissions",
			    },
			    load: function(mysubmissions){
			    	mysubmissions.forEach(function(object){
			    		if(object.objectType == "reading"){
			    			var reading = new bluemix.ReadingTemplate();
			    			reading.favoriteBtn.style.display ="none";
			    			reading.reading_title.innerHTML = object.title;
			    			reading.reading_description.innerHTML = object.description;
			    			reading.reading_link.innerHTML = object.uri;
			    			
			    			if(object.like == "Y")
			    				reading.likeBtn.style.display ="none";
			    			
			    			mixTemplate.mixContent.appendChild(reading.domNode);
			    			
			    		}else if(object.objectType == "roadmap"){
			    			
			    			var roadMap = new bluemix.RoadmapTemplate();
			    			roadMap.favoriteBtn.style.display ="none";
			    			roadMap.roadmap_title.innerHTML = object.title;
			    			roadMap.roadmap_description.innerHTML = object.description;
			    			roadMap.reading_link.innerHTML = object.uri;
			    			
			    			if(object.like == "Y")
			    				roadMap.likeBtn.style.display ="none";
			    			
			    			mixTemplate.mixContent.appendChild(roadMap.domNode);
			    		}
			    	});
			    },
			    error: function(error){
			    	alert("Sorry, we are unable to process your request. We are working hard on this issue.");
			    }
			});*/
		
		});
	},
	
	onRoadMapsClick:function(){
		require(["dojo/dom-construct"], function(domConstruct){
			
			domConstruct.empty(mixTemplate.mixContent);
			var roadMap = new bluemix.RoadmapTemplate();
			roadMap.favoriteBtn.style.display ="none";
			mixTemplate.mixContent.appendChild(roadMap.domNode);
			
			/*dojo.xhrGet({
				url: "/object",
				headers: {"Content-Type": "application/json", "Accept": "application/json"},
			    handleAs: "json",
			    content: {
			    	mysubmissions: "mysubmissions",
			    },
			    load: function(mysubmissions){
			    	mysubmissions.forEach(function(object){
			    		if(object.objectType == "roadmap"){
			    			
			    			var roadMap = new bluemix.RoadmapTemplate();
			    			roadMap.favoriteBtn.style.display ="none";
			    			roadMap.roadmap_title.innerHTML = object.title;
			    			roadMap.roadmap_description.innerHTML = object.description;
			    			roadMap.reading_link.innerHTML = object.uri;
			    			
			    			if(object.like == "Y")
			    				roadMap.likeBtn.style.display ="none";
			    			
			    			mixTemplate.mixContent.appendChild(roadMap.domNode);
			    		}
			    	});
			    },
			    error: function(error){
			    	alert("Sorry, we are unable to process your request. We are working hard on this issue.");
			    }
			});*/
		
		});

	},
	
	onReadingsClick:function(){
		require(["dojo/dom-construct"], function(domConstruct){
			
			domConstruct.empty(mixTemplate.mixContent);
			var reading = new bluemix.ReadingTemplate();
			reading.favoriteBtn.style.display ="none";
			mixTemplate.mixContent.appendChild(reading.domNode);
			
			/*dojo.xhrGet({
				url: "/object",
				headers: {"Content-Type": "application/json", "Accept": "application/json"},
			    handleAs: "json",
			    content: {
			    	mysubmissions: "mysubmissions",
			    },
			    load: function(mysubmissions){
			    	mysubmissions.forEach(function(object){
			    		if(object.objectType == "reading"){
			    			var reading = new bluemix.ReadingTemplate();
			    			reading.favoriteBtn.style.display ="none";
			    			reading.reading_title.innerHTML = object.title;
			    			reading.reading_description.innerHTML = object.description;
			    			reading.reading_link.innerHTML = object.uri;
			    			
			    			if(object.like == "Y")
			    				reading.likeBtn.style.display ="none";
			    			
			    			mixTemplate.mixContent.appendChild(reading.domNode);
			    			
			    		}
			    	});
			    },
			    error: function(error){
			    	alert("Sorry, we are unable to process your request. We are working hard on this issue.");
			    }
			});*/
		
		});
	}


});
});