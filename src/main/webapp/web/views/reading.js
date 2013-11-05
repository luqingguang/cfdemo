require(["dijit/form/TextBox","dijit/form/Button","dojo/query","dojo/ready","bluemix/ReadingTemplate"],function(TextBox,Button,query,ready,ReadingTemplate){
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
		
		var content = query("#content")[0];
		var readings = new ReadingTemplate();
		content.appendChild(readings.domNode);
		readings = new ReadingTemplate();
		content.appendChild(readings.domNode);
		
	});
});

require(["dojo/on","dojo/ready"],function(on,ready){
	ready(function(){
		on(document.getElementById("roadmaps"),"click",window.loadRoadmaps);
		on(document.getElementById("readings"),"click",window.loadReadings);
		on(document.getElementById("friends"),"click",window.loadFriends);
	});
});


function setMainContentTabs(selectedId){
	require(["dojo/query","dojo/ready"],function(query,ready){
		ready(function(){
			query(".mainContent .tabs ul li").forEach(function(ele){
				if(ele.id == selectedId){
					ele.className += "selected";
				}else{
					ele.className = ele.className.replace("selected","");
					}
			});
		});
	});
}

function loadReadings(){
	
	require(["dojo/dom-construct","bluemix/ReadingTemplate"], function(domConstruct,ReadingTemplate){
		
		  window.setMainContentTabs("readings");
		  // Empty node's children byId:
		  domConstruct.empty("content");
		  
		  var content = document.getElementById("content");
		  var roadmap = new ReadingTemplate();
		  content.appendChild(roadmap.domNode);
		  roadmap = new ReadingTemplate();
		  content.appendChild(roadmap.domNode);
	});
	
	
}


function loadRoadmaps(){
	
	require(["dojo/dom-construct","bluemix/RoadmapTemplate"], function(domConstruct,RoadmapTemplate){
		
		window.setMainContentTabs("roadmaps");
		
		  // Empty node's children byId:
		  domConstruct.empty("content");
		  
		  var content = document.getElementById("content");
		  var roadmap = new RoadmapTemplate();
		  content.appendChild(roadmap.domNode);
		  roadmap = new RoadmapTemplate();
		  content.appendChild(roadmap.domNode);
	});
	
	
}

function loadFriends(){
	
	require(["dojo/dom-construct","bluemix/MyFriendTemplate"], function(domConstruct,MyFriendTemplate){
		
		  window.setMainContentTabs("friends");
		  // Empty node's children byId:
		  domConstruct.empty("content");
		  
		  var content = document.getElementById("content");
		  var roadmap = new MyFriendTemplate();
		  content.appendChild(roadmap.domNode);
		  roadmap = new MyFriendTemplate();
		  content.appendChild(roadmap.domNode);
	});
	
	
}