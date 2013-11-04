package com.objectwing.cfdemo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="message")
public class Message implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public static final String ACTION_TYPE_CREATE_READING = "Create Reading";
	public static final String ACTION_TYPE_CREATE_ROADMAP = "Create Roadmap";
	public static final String ACTION_TYPE_CREATE_REVIEW = "Create Review";
	public static final String ACTION_TYPE_FOLLOW_PERSON = "Follow Person";
	public static final String ACTION_TYPE_FOLLOW_TOPIC = "Follow Topic";
	public static final String ACTION_TYPE_CREATE_TASK = "Create Task";
	public static final String ACTION_TYPE_COMPLETE_TASK = "Complete Task";
	
	public static final String TITLE_CREATE_READING = "Reading added to topic {0}";
	public static final String TITLE_CREATE_ROADMAP = "Roadmap added to topic {0}";
	public static final String TITLE_CREATE_REVIEW = "{0} reviewed the {1}";
	public static final String TITLE_FOLLOW_PERSON = "{0} followed the person {1}";
	public static final String TITLE_FOLLOW_TOPIC = "{0} followed the topic {1}";
	public static final String TITLE_CREATE_TASK = "{0} want to read {1}";
	public static final String TITLE_COMPLETE_TASK = "{0} has finished {1}";
	
	

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer messageId;
	
	@ManyToOne
	private Person actionBy;
	
	private String actionType;
	private Integer actionObjectId;
	private String Title;	
	private Date createDate;
	public Integer getMessageId() {
		return messageId;
	}
	public void setMessageId(Integer messageId) {
		this.messageId = messageId;
	}
	public Person getActionBy() {
		return actionBy;
	}
	public void setActionBy(Person actionBy) {
		this.actionBy = actionBy;
	}
	public String getActionType() {
		return actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}
	public Integer getActionObjectId() {
		return actionObjectId;
	}
	public void setActionObjectId(Integer actionObjectId) {
		this.actionObjectId = actionObjectId;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	
	

    
    
}
