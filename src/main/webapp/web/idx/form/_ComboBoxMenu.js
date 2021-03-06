/*
 * Licensed Materials - Property of IBM
 * (C) Copyright IBM Corp. 2010, 2012 All Rights Reserved
 * US Government Users Restricted Rights - Use, duplication or
 * disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
 */

define([
	"dojo/_base/declare",
	"dojo/_base/event",
	"dojo/dom-class",
	"dojo/query",
	"dijit/form/_ComboBoxMenu"
], function(declare, event, domClass, query, _ComboBoxMenu){
	
	//	module:
	//		idx/form/_ComboBoxMenu
	//	summary:
	//		One UI version ComboBox Menu

	return declare("idx.form._ComboBoxMenu", [_ComboBoxMenu],{
		// summary:
		//		One UI version ComboBox Menu
		
		_onMouseUp: function(/*Event*/ evt){
			if(!this.readOnly){
				this.inherited(arguments);
			}
		},
		
		_onMouseDown: function(/*Event*/ evt, /*DomNode*/ target){
			event.stop(evt);
			if(this._hoveredNode){
				this.onUnhover(this._hoveredNode);
				this._hoveredNode = null;
			}
			this._isDragging = true;
			
			// Workaround to make code compatible with 1.7 & 1.8
			var node = target;
			
			this._setSelectedAttr(node);
			if(node && node.parentNode == this.containerNode){
				this.onMouseDown(node);
			}
		},
		
		onMouseDown: function(/*DomNode*/ node){
			domClass.add(node, "dijitMenuItemActive");
		},
		onUnMouseDown: function(/*DomNode*/ node){
			query(".dijitMenuItemActive", this.domNode).removeClass("dijitMenuItemActive");
		}
	});
});