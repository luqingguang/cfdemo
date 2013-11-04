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
@Table(name="review")
public class Review implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public static final String OBJECT_TYPE_READING = "Reading";
	public static final String OBJECT_TYPE_ROADMAP = "Roadmap";

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer reviewId;
	
	@ManyToOne
	private Person reviewBy;
	
	private Date createDate;	
	private String title;
	private String description;
	private Integer remark;	
	private String objectType;	
	private Integer objectId;
	public Integer getReviewId() {
		return reviewId;
	}
	public void setReviewId(Integer reviewId) {
		this.reviewId = reviewId;
	}
	public Person getReviewBy() {
		return reviewBy;
	}
	public void setReviewBy(Person reviewBy) {
		this.reviewBy = reviewBy;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getRemark() {
		return remark;
	}
	public void setRemark(Integer remark) {
		this.remark = remark;
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
