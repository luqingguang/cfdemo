<!doctype html>
<head>
	<meta charset="utf-8">
	<title>Tutorial: Hello Dojo!</title>
	 <script>
    	var contextPath = "<%=request.getContextPath()%>";
    	dojoConfig = {
	  	      tlmSiblingOfDojo: false,
	  	      parseOnLoad: true,
	  	      async: true,
	  	      packages:[
				{name: "idx", location: contextPath + "/web/idx"},
				{name: "bluemix", location: contextPath + "/web/bluemix"}
	  	      ]
    	};
    </script>
    <script src="//ajax.googleapis.com/ajax/libs/dojo/1.9.1/dojo/dojo.js"></script>
    <script src="${pageContext.request.contextPath}/web/views/main.js"></script>
    <link rel="stylesheet" type="text/css" href="//ajax.googleapis.com/ajax/libs/dojo/1.9.1/dojo/resources/dojo.css">
    <link rel="stylesheet" type="text/css" href="//ajax.googleapis.com/ajax/libs/dojo/1.9.1/dijit//themes/claro/claro.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/web/views/main.css"/>
</head>
<body style="font-size:16px"  class="claro">
	<div class="header">
		<ul class="linkList">
			<li class="item">Home</li>
			<li class="item">About</li>
			<li class="item">Contact</li>
		</ul>
		<h3 class="productName">Fun Reading</h3>
	</div>
	<div class="mainContent" >
		<h1>Welcome to Fun Reading</h1>
		<p>Fun Reading is not just about fun, it helps you: <br> 1. explore the best roadmaps to become an expert. <br> 2. explore the activities of your friends. <br> 3. keep track of reading roadmaps.</p>
		
		<div id="login"></div>
	</div>
	<div class="footer"></div>
</body>