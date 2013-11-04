package com.objectwing.cfdemo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name="object_topic")
public class ObjectTopic implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public static final String OBJECT_TYPE_READING = "Reading";
	public static final String OBJECT_TYPE_ROADMAP = "Roadmap";

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer objectTopicId;
	
	@ManyToOne
	private Topic topic;
	
	private String objectType;	
	private Integer objectId;
	public Integer getObjectTopicId() {
		return objectTopicId;
	}
	public void setObjectTopicId(Integer objectTopicId) {
		this.objectTopicId = objectTopicId;
	}
	public Topic getTopic() {
		return topic;
	}
	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	public String getObjectType() {
		return objectType;
	}
	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}
	public Integer getObjectId() {
		return objectId;
	}
	public void setObjectId(Integer objectId) {
		this.objectId = objectId;
	} 

    
    
}
