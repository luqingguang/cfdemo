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
         "dojo/text!./resources/TopicTemplate.html",
], 
function(declare, parser, _WidgetBase, _TemplatedMixin,_WidgetsInTemplateMixin, template) {
return declare("bluemix.TopicTemplate", 
			[ _WidgetBase, _TemplatedMixin,_WidgetsInTemplateMixin ], {
	
	/**
     * The path to the widget template for the dijit._Templated base class.
     * 
     * @private
     * @constant
     * @type String
     */
	templateString : template,
	templateId: null,

	/**
	 * component startup
	 */
	startup : function() {
		this.constructor.superclass.startup.apply(this);	
	},
	
	topicTemplate:null,
	postCreate: function(){
		topicTemplate = this;
		
		require(["dojo/ready","dojo/on"], function(ready,on){
			ready(function(){
				on(topicTemplate.followAction, "click", function(id){
					  return function(){topicTemplate.onFollowActionClick(id);};
				  }(topicTemplate.templateId));
			});
		});
	},
	
	onFollowActionClick: function(id){
		if(topicTemplate.followAction.innerHTML == "UnFollow"){
			alert(id);
			topicTemplate.followAction.innerHTML = "Follow";
			/*dojo.xhrPost({
				url:"/topic/unfollow/" + id,
				headers: {"Content-Type": "application/json", "Accept": "application/json"},
				postData: dojo.toJson({
				}),
				handleAs: "json",
				load: function(response, ioArgs) {
					//password initial status
					if(response.topicId){									
						topicTemplate.followAction.innerHTML = "Follow";
					}else 
						alert("Sorry, we are unable to process your request. We are working hard on this issue.");
				},
				error: function(error){
					alert("Sorry, we are unable to process your request. We are working hard on this issue.");
				}
			});*/
		}
		else{
			alert(id);
			topicTemplate.followAction.innerHTML = "UnFollow";
			/*dojo.xhrPost({
				url:"/topic/follow/" + id,
				headers: {"Content-Type": "application/json", "Accept": "application/json"},
				postData: dojo.toJson({
				}),
				handleAs: "json",
				load: function(response, ioArgs) {
					//password initial status
					if(response.topicId){									
						topicTemplate.followAction.innerHTML = "UnFollow";
					}else 
						alert("Sorry, we are unable to process your request. We are working hard on this issue.");
				},
				error: function(error){
					alert("Sorry, we are unable to process your request. We are working hard on this issue.");
				}
			});*/
		}
		
		/*require(["dojo/topic"], function(topic){
		    topic.publish("refreshMyTopics");
		});*/
	}

});
});