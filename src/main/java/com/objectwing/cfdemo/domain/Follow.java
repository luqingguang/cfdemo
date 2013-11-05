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
@Table(name="follow")
public class Follow implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public String FOLLOW_TYPE_PERSON = "Person";
	public String FOLLOW_TYPE_TOPIC = "Topic";
	public String FOLLOW_STATUS_FOLLOW = "Follow";
	public String FOLLOW_STATUS_UNFOLLOW = "Unfollow";

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer followId;
	
	@ManyToOne
	private Person followBy;
	
	private String followType;	
	private Integer followObjectId;
	private String status;
	private Date followDate;
	private Date unfollowDate;
	public Integer getFollowId() {
		return followId;
	}
	public void setFollowId(Integer followId) {
		this.followId = followId;
	}
	public Person getFollowBy() {
		return followBy;
	}
	public void setFollowBy(Person followBy) {
		this.followBy = followBy;
	}
	public String getFollowType() {
		return followType;
	}
	public void setFollowType(String followType) {
		this.followType = followType;
	}
	public Integer getFollowObjectId() {
		return followObjectId;
	}
	public void setFollowObjectId(Integer followObjectId) {
		this.followObjectId = followObjectId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getFollowDate() {
		return followDate;
	}
	public void setFollowDate(Date followDate) {
		this.followDate = followDate;
	}
	public Date getUnfollowDate() {
		return unfollowDate;
	}
	public void setUnfollowDate(Date unfollowDate) {
		this.unfollowDate = unfollowDate;
	}
	

    
    
}
