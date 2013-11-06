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
		
		window.loadAll();
		
		/*var section = document.getElementById("section");
		var myRoadmap = new MyRoadmapsTemplate();
		section.appendChild(myRoadmap.domNode);
		var myReadings = new MyReadingsTemplate();
		section.appendChild(myReadings.domNode);*/
	});
});

require(["dojo/on","dojo/ready"],function(on,ready){
	ready(function(){
		on(document.getElementById("all"),"click",window.loadAll);
		on(document.getElementById("favorites"),"click",window.loadFavorites);
		on(document.getElementById("likes"),"click",window.loadLikes);
		on(document.getElementById("mytopics"),"click",window.loadMyTopics);
		on(document.getElementById("myposts"),"click",window.loadMyPosts);
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

function loadAll(){
	
	require(["dojo/dom-construct","bluemix/MixTemplate"], function(domConstruct,MixTemplate){
		
		  window.setMainContentTabs("all");
		  // Empty node's children byId:
		  domConstruct.empty("content");
		  
		  var content = document.getElementById("content");
		  var roadmap = new MixTemplate();
		  content.appendChild(roadmap.domNode);
	});
	
	
}


function loadFavorites(){
	
	require(["dojo/dom-construct","bluemix/MyFavoritesTemplate"], function(domConstruct,MyFavoritesTemplate){
		
		  window.setMainContentTabs("favorites");
		  // Empty node's children byId:
		  domConstruct.empty("content");
		  
		  var content = document.getElementById("content");
		  content.appendChild(new MyFavoritesTemplate().domNode);
	});
	
	
}

function loadLikes(){
	
	require(["dojo/dom-construct","bluemix/MyLikesTemplate"], function(domConstruct,MyLikesTemplate){
		
		  window.setMainContentTabs("likes");
		  // Empty node's children byId:
		  domConstruct.empty("content");
		  
		  var content = document.getElementById("content");
		  content.appendChild(new MyLikesTemplate().domNode);
	});
	
	
}

function loadMyTopics(){
	
	require(["dojo/dom-construct","bluemix/MyTopicsTemplate"], function(domConstruct,MyTopicsTemplate){
		
		  window.setMainContentTabs("mytopics");
		  // Empty node's children byId:
		  domConstruct.empty("content");
		  
		  var content = document.getElementById("content");
		  content.appendChild(new MyTopicsTemplate().domNode);
	});
	
	
}

function loadMyPosts(){
	
	require(["dojo/dom-construct","bluemix/MyPostsTemplate"], function(domConstruct,MyPostsTemplate){
		
		  window.setMainContentTabs("myposts");
		  // Empty node's children byId:
		  domConstruct.empty("content");
		  
		  var content = document.getElementById("content");
		  content.appendChild(new MyPostsTemplate().domNode);
	});
	
	
}
