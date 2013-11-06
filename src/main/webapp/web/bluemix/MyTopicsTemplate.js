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
         "dojo/text!./resources/MyTopicsTemplate.html",
         "bluemix/TopicTemplate"
], 
function(declare, parser, _WidgetBase, _TemplatedMixin,_WidgetsInTemplateMixin, template) {
return declare("bluemix.MyTopicsTemplate", 
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
	startup : function() {
		this.constructor.superclass.startup.apply(this);		
	},
	
	myTopicsTemplate: null,
	postCreate: function(){
		myTopicsTemplate = this;
		this.loadMyTopics();
		require(["dojo/topic"], function(topic){
		    topic.subscribe("refreshMyTopics", myTopicsTemplate.loadMyTopics);
		});
	},
	
	loadMyTopics: function(){
		console.log("Refresh My Topics");
		var topicInstance = new bluemix.TopicTemplate();
		topicInstance.templateId = 1300;
		topicInstance.title.innerHTML = "From Winnie";
		topicInstance.description.innerHTML = "<p> Java Platform, Enterprise Edition or Java EE is Oracle's enterprise Java computing platform. The platform provides an API and runtime environment for developing and running enterprise software, including network and web services, and other large-scale, multi-tiered, scalable, reliable, and secure network applications. Java EE extends the Java Platform, Standard Edition (Java SE),[1] providing an API for object-relational mapping, distributed and multi-tier architectures, and web services. </p>";
		topicInstance.followAction.innerHTML = "UnFollow";		
		myTopicsTemplate.myTopicsContainer.appendChild(topicInstance.domNode);
		
		/*dojo.xhrGet({
			url: "/topic",
			handleAs: "json",
			load:function(allTopics, ioArgs){
				allTopics.forEach(function(topic){
					
					var topicInstance = new bluemix.TopicTemplate();
					topicInstance.templateId = topic.topicId;
					topicInstance.title.innerHTML = topic.title;
					topicInstance.description.innerHTML = topic.description;
					if(topic.follow == "Y")
						topicInstance.followAction.innerHTML = "UnFollow";
					else 
						topicInstance.followAction.innerHTML = "Follow";
					
					allTopicsTemplate.appendChild(topicInstance.domNode);
				});
			},
			error:function(error){
				alert("");
			}
		});*/
	}

});
});