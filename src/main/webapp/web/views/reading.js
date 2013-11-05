require(["dijit/form/TextBox","dojo/ready"],function(TextBox,ready){
	ready(function(){
		var searchBox = new TextBox({
			placeHolder:"Search"
		},"searchBox");
	});
});