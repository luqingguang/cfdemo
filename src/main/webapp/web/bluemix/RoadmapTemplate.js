/*
 * Licensed Materials - Property of IBM
 * (C) Copyright IBM Corp. 2012 All Rights Reserved
 * US Government Users Restricted Rights - Use, duplication or 
 * disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
 */
define([ "dojo/_base/declare", 
         "dojo/parser", 
         "dijit/_WidgetBase",
         "dijit/_TemplatedMixin", 
         "dijit/_WidgetsInTemplateMixin",
         "dojo/text!./resources/RoadmapTemplate.html",
         "dijit/form/HorizontalSlider", 
         "dijit/form/HorizontalRule", 
         "dijit/form/HorizontalRuleLabels"
], 
function(declare, parser, _WidgetBase, _TemplatedMixin,_WidgetsInTemplateMixin, template) {
return declare("bluemix.RoadmapTemplate", 
			[ _WidgetBase, _TemplatedMixin,_WidgetsInTemplateMixin ], {
	
	/**
     * The path to the widget template for the dijit._Templated base class.
     * 
     * @private
     * @constant
     * @type String
     */
	templateString : template,

	/**
	 * component startup
	 */
	startup : function() {
		service = this;
		this.constructor.superclass.startup.apply(this);	
	},
	
	onhorizontalSliderChange: function(value){
		this.milestone.innerHTML = "MileStone " + value;
	}

});
});