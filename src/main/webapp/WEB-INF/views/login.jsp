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
				{name: "dojox", location: contextPath + "/web/dojo_1.9.1/dojox"},
				{name: "idx", location: contextPath + "/web/idx"},
				{name: "bluemix", location: contextPath + "/web/bluemix"}
	  	      ]
    	};
    </script>
    <script src="${pageContext.request.contextPath}/web/dojo_1.9.1/dojo/dojo.js"></script>
    <script src="${pageContext.request.contextPath}/web/views/login.js"></script>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/web/dojo_1.9.1/dojo/resources/dojo.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/web/dojo_1.9.1/dijit//themes/claro/claro.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/web/views/login.css"/>
</head>
<body style="font-size:16px"  class="claro">
	<div class="header">
		<ul class="linkList">
			<li class="item" onClick="pageHandOver('Home');">Home</li>
			<li class="item" onClick="pageHandOver('About');">About</li>
			<li class="item" onClick="pageHandOver('Contact');">Contact</li>
		</ul>
		<h3 class="productName">Fun Reading</h3>
	</div>
	<div class="mainContent" id="homeDiv">
		<h1>Welcome to Fun Reading</h1>
		<p>Fun Reading is not just about fun, it helps you: <br> 1. explore the best roadmaps to become an expert. <br> 2. explore the activities of your friends. <br> 3. keep track of reading roadmaps.</p>
		
		<div id="login"></div>
	</div>
<div class="mainContent" style="display:none" id="aboutDiv">
		<h1>About Fun Reading </h1>
		<div class="aboutContent"><img src="${pageContext.request.contextPath}/web/images/reading.png">
		<p>Fun Reading is not just about fun, it helps you explore the best roadmaps to become an expert. Share the stories with your friends. Keep track of reading roadmaps.
		</p></div>
	</div>
	<div class="mainContent" style="display:none" id="contactDiv">
		<ul class="ulpersonalList">
			<li class="lipersonal">
				<img src="${pageContext.request.contextPath}/web/images/qingguang.png">
				<h3>LU, QING GUANG </h3>
				<p>IBM Software Group, Application and Integration Middleware Software
				<br>ASSOC ARCHITECT
				<br><strong>Phone:</strong> 86-10-82450469 <strong style="margin-left:30px"> E-mail:</strong> luqg@cn.ibm.com</p>
			</li>
			<li class="lipersonal">
				<img src="${pageContext.request.contextPath}/web/images/winnie.png">
				<h3>JIANG, PEI LING </h3>
				<p>IBM Software Group, Application and Integration Middleware Software 
				<br>Analytic Answers-Developer
				<br><strong>Phone:</strong> 86-010-82453094  <strong style="margin-left:30px">E-mail:</strong> jpljiang@cn.ibm.com</p>		
			</li>
			<li class="lipersonal">
				<img src="${pageContext.request.contextPath}/web/images/xumin.png">
				<h3>Xu, Min</h3>
				<p>IBM Software Group, Application and Integration Middleware Software
				<br>Analytic Answers-Developer
				<br><strong>Phone:</strong> 86-010-82453758  <strong style="margin-left:30px">E-mail:</strong> xminxm@cn.ibm.com</p>		
			</li>
		</ul>
	</div>
	<div class="footer"></div>
</body>