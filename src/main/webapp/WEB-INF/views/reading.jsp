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
				{name: "idx", location: contextPath + "/web/idx"},
				{name: "bluemix", location: contextPath + "/web/bluemix"}
	  	      ]
    	};
    </script>
    <script src="//ajax.googleapis.com/ajax/libs/dojo/1.9.1/dojo/dojo.js"></script>
    <script src="${pageContext.request.contextPath}/web/views/reading.js"></script>
    <link rel="stylesheet" type="text/css" href="//ajax.googleapis.com/ajax/libs/dojo/1.9.1/dojo/resources/dojo.css">
    <link rel="stylesheet" type="text/css" href="//ajax.googleapis.com/ajax/libs/dojo/1.9.1/dijit//themes/claro/claro.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/web/views/reading.css"/>
</head>
<body style="font-size:16px"  class="claro">
	<div class="header">
		<div class="title">
			<a id=""href="#">Winnie
			</a>
			<h3>Fun Reading</h3>
			<div id="searchBox"></div>
		</div>
	</div>
	<div class="mainContent"></div>
</body>