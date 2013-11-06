require(["dijit/form/TextBox","dijit/form/Button","dojo/query","dojo/ready","bluemix/MyRoadmapsTemplate","bluemix/MyReadingsTemplate"],function(TextBox,Button,query,ready,MyRoadmapsTemplate,MyReadingsTemplate){
	ready(function(){
		var searchBox = new TextBox({
			placeHolder:"Search"
		},"searchBox");
		
		var title = query(".title")[0];
		var questionBtn = new Button({
			label:"Add Readings",
			style:'float:right;'
		});
		
		if(title.firstChild)
			title.insertBefore(questionBtn.domNode,title.firstChild);
		else
			title.appendChild(questionBtn.domNode);
		
		window.loadAllTopics();
		
	});
});


function loadAllTopics(){
	
	require(["dojo/dom-construct","bluemix/AllTopicsTemplate"], function(domConstruct,AllTopicsTemplate){
		
		  // Empty node's children byId:
		  domConstruct.empty("content");
		  
		  var content = document.getElementById("content");
		  var roadmap = new AllTopicsTemplate();
		  content.appendChild(roadmap.domNode);
	});
	
	
}