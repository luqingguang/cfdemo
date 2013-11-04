/**
 * 
*/
require(["bluemix/AjaxValidationTextBox","dijit/form/ValidationTextBox","dijit/form/Button","dojo/query", "dojo/ready"],function(AjaxValidationTextBox,ValidationTextBox,Button,query,ready){
	ready(function(){
		var loginDiv = query("#login")[0];
		
		var usernameBox = new ValidationTextBox({
			invalidMessage:'Username is already taken',
			placeHolder:"user name",
			style:"margin-right:5px;width:200px;"});
	
		var passwordBox = new ValidationTextBox({
			placeHolder:'password',
			style:"margin-right:5px;width:200px;"});
		
		var signinBtn = new Button({
			label: "Sign In",
			style:"margin-right:5px;"
		});
		
		var signupBtn = new Button({
			label: "Sign Up",
			style:"margin-right:5px;"
		});
		
		loginDiv.appendChild(usernameBox.domNode);
		loginDiv.appendChild(passwordBox.domNode);
		loginDiv.appendChild(signinBtn.domNode);
		loginDiv.appendChild(signupBtn.domNode);
	});
});
