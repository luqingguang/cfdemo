<!doctype html>
<head>
	<meta charset="utf-8">
	<title>Roadmap</title>
	 <script>
    	var contextPath = "<%=request.getContextPath()%>";
    	dojoConfig = {
	  	      tlmSiblingOfDojo: false,
	  	      parseOnLoad: true,
	  	      async: true,
	  	      packages:[
				{name: "dojo", location: contextPath + "/web/dojo_1.9.1/dojo"},
				{name: "dijit", location: contextPath + "/web/dojo_1.9.1/dijit"},
				{name: "idx", location: contextPath + "/web/idx"},
				{name: "bluemix", location: contextPath + "/web/bluemix"}
	  	      ]
    	};
    </script>
    <script src="${pageContext.request.contextPath}/web/dojo_1.9.1/dojo/dojo.js"></script>
    <script src="${pageContext.request.contextPath}/web/views/reading.js"></script>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/web/dojo_1.9.1/dojo/resources/dojo.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/web/dojo_1.9.1/dijit//themes/claro/claro.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/web/views/reading.css"/>
</head>
<body style="font-size:16px"  class="claro">
	<div class="header">
		<div class="title">
			<a id="userLink" class="rightMargin20" href="${pageContext.request.contextPath}/myReading">Winnie
			</a>
			<h3>Fun Reading</h3>
			<div id="searchBox"></div>
		</div>
	</div>
	<div class="mainContent">
		<div id="tabs" class="tabs fixedblock">
			<ul class="public">
				<li id="all">All Posts</li>				
			</ul>
			<ul class="private">
				<li id="favorites">My Favorites</li>
				<li id="likes">My Likes</li>
				<li id="mytopics">My Topics</li>
				<li id="myposts">My Posts</li>
			</ul>
		</div>
		<div id="content" class="content">
		</div>
		<!-- div id="section" class="outterDialog fixedblock">	
		</div-->

	</div>
	
</body>