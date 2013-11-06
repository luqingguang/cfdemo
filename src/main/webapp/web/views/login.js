/**
 * 
*/
require(["bluemix/AjaxValidationTextBox","dijit/form/ValidationTextBox","dijit/form/Button","dojo/query", "dojo/ready","dojox/validate/web"],function(AjaxValidationTextBox,ValidationTextBox,Button,query,ready,validate){
	ready(function(){
		var loginDiv = query("#login")[0];
		
		var usernameBox = new ValidationTextBox({
			invalidMessage:'Invalid email address',
			placeHolder:"email",
			validator:validate.isEmailAddress,
			style:"margin-right:5px;width:200px;"});
	
		var passwordBox = new ValidationTextBox({
			type:'password',
			placeHolder:'password',
			style:"margin-right:5px;width:200px;"});
		
		var signinBtn = new Button({
			label: "Sign In",
			style:"margin-right:5px;",
			onClick:function(username,password){
				return function(){
					window.onSignIn(username,password);
					};
			}(usernameBox,passwordBox)
		});
		
		usernameBox.validator = function(value, constraints){

		    // Check that email has not been used yet.
		    return validate.isEmailAddress(value, constraints);
		};
		
		var signupBtn = new Button({
			label: "Sign Up",
			style:"margin-right:5px;",
			onClick:function(username,password){
				return function(){
					window.onSignUp(username,password);
					};
			}(usernameBox,passwordBox)
		});
		
		loginDiv.appendChild(usernameBox.domNode);
		loginDiv.appendChild(passwordBox.domNode);
		loginDiv.appendChild(signinBtn.domNode);
		loginDiv.appendChild(signupBtn.domNode);
	});
});

function onSignIn(username,password){
	if(username.value && username.isValid() && password.value){
		window.location.href = window.contextPath + "/reading";
		/*dojo.xhrPost({
			url:"/login",
			headers: {"Content-Type": "application/json", "Accept": "application/json"},
			postData: dojo.toJson({
				"loginName":username.value,
				"password":password.value
			}),
			handleAs: "json",
			load: function(response, ioArgs) {
				//password initial status
				if(response.success == "Y"){									
					//redirect
					window.location.href = window.contextPath + "/reading";
				}else 
					alert(response.message);
			},
			error: function(error){
				alert("Sorry, we are unable to process your request. We are working hard on this issue.");
			}
		});*/
	}
	else
		alert("Please input your email and password.");
}

function pageHandOver(e){
	require(["dojo/query", "dojo/ready"],function(query,ready){
		ready(function(){
				if(e=="About"){
					query("#homeDiv")[0].style.display="none";
					query("#aboutDiv")[0].style.display="block";
					query("#contactDiv")[0].style.display="none";
				}else if(e=="Contact"){
					query("#homeDiv")[0].style.display="none";
					query("#aboutDiv")[0].style.display="none";
					query("#contactDiv")[0].style.display="block";
				}else{
					query("#homeDiv")[0].style.display="block";
					query("#aboutDiv")[0].style.display="none";
					query("#contactDiv")[0].style.display="none";
				}
			});
		});	
}
function onSignUp(username,password){
	if(username.value && username.isValid() && password.value){
		window.location.href = window.contextPath + "/select";
		/*dojo.xhrPost({
			url:"/signup",
			headers: {"Content-Type": "application/json", "Accept": "application/json"},
			postData: dojo.toJson({
				"name":username.value,
				"loginName":username.value,
				"password":password.value
			}),
			handleAs: "json",
			load: function(response, ioArgs) {
				//password initial status
				if(response.success == "Y"){									
					//redirect
					alert("Thanks for join Fun Reading. Hope you will like it.");
					window.location.href = window.contextPath + "/reading";
				}else 
					alert(response.message);
			},
			error: function(error){
				alert("Sorry, we are unable to process your request. We are working hard on this issue.");
			}
		});*/
	}
	else
		alert("Please input your email and password.");
}
