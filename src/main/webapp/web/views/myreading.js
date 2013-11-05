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
		
		window.loadTopics();
		
	});
});

require(["dojo/on","dojo/ready"],function(on,ready){
	ready(function(){
		on(document.getElementById("topics"),"click",window.loadTopics);

	});
});


function setMainContentTabs(selectedId){
	require(["dojo/query","dojo/ready"],function(query,ready){
		ready(function(){
			query(".mainContent .tabs ul li").forEach(function(ele){
				if(ele.id == selectedId){
					ele.className = "selected";
				}else{
					ele.className = ele.className.replace("selected","");
					}
			});
		});
	});
}

function loadTopics(){
	
	require(["dojo/dom-construct","bluemix/TopicTemplate"], function(domConstruct,TopicTemplate){
		
		  window.setMainContentTabs("topics");
		  // Empty node's children byId:
		  domConstruct.empty("content");
		  
		  var content = document.getElementById("content");
		  var roadmap = new TopicTemplate();
		  content.appendChild(roadmap.domNode);
		  roadmap = new TopicTemplate();
		  content.appendChild(roadmap.domNode);
	});
	
	
}