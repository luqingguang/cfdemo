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
         "dojo/text!./resources/AllTopicsTemplate.html",
         "bluemix/TopicSmallTemplate",
         "dijit/form/Button"
], 
function(declare, parser, _WidgetBase, _TemplatedMixin,_WidgetsInTemplateMixin, template) {
return declare("bluemix.AllTopicsTemplate", 
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
		service = this;
		this.constructor.superclass.startup.apply(this);	
	},
	
	
	allTopicsTemplate: null,
	postCreate: function(){
		allTopicsTemplate = this;
		this.loadAllTopics();
	},
	
	topicsArray: new Array(),
	loadAllTopics: function(){
		for(var i=0; i<5; i++){
			var topicInstance = new bluemix.TopicSmallTemplate({
				style:'float:left;margin-right:50px;margin-bottom:30px;'
			}).placeAt(allTopicsTemplate.allTopicsContainer,"last");
			topicInstance.templateId = i;
			topicInstance.title.innerHTML = "J2EE" + i;
			topicInstance.followAction.innerHTML = "Follow";		
			topicInstance.show();
			
			this.topicsArray.push(topicInstance);
			
		}
		/*dojo.xhrGet({
			url: "/topic",
			handleAs: "json",
			load:function(allTopics, ioArgs){
				allTopics.forEach(function(topic){
					
					var topicInstance = new bluemix.TopicSmallTemplate();
					topicInstance.templateId = topic.topicId;
					topicInstance.title.innerHTML = topic.title;
					if(topic.follow == "Y")
						topicInstance.followAction.innerHTML = "UnFollow";
					else 
						topicInstance.followAction.innerHTML = "Follow";
					allTopicsTemplate.allTopicsContainer.appendChild(topicInstance.domNode);
					topicInstance.postCreate();
					
					topicsArray.push(topicInstance);
				});
			},
			error:function(error){
				alert("");
			}
		});*/
	},
	
	onCompleteBtnClick:function(){
		if(this.topicsArray.some(function(topic){
			return topic.followAction.innerHTML == "UnFollow";
		})){
			
			
			window.location.href = window.contextPath + "/reading";
		}else
			alert("No topics is followed.");
	}

});
});