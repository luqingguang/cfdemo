package com.objectwing.cfdemo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="task")
public class Task implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public static final String TASK_TYPE_READING = "Reading";
	public static final String TASK_TYPE_MILESTONE = "Milestone";
	public static final String TASK_TYPE_ROADMAP = "Roadmap";
	public static final String TASK_READ_YES = "Y";
	public static final String TASK_READ_NO = "N";
	public static final String TASK_LIKE_YES = "Y";
	public static final String TASK_LIKE_NO = "N";
	public static final String TASK_FAVORITE_YES = "Y";
	public static final String TASK_FAVORITE_NO = "N";
	

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer taskId;	
	
	private String taskType;
	
	private Integer taskObjectId;
	
	private String read;
	
	private String like;
	
	private String favorite;	
	
	private Date createDate;
	
	private Date readDate;
	
	private Date likeDate;
	
	private Date favoriteDate;

	public Integer getTaskId() {
		return taskId;
	}

	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}

	public String getTaskType() {
		return taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

	public Integer getTaskObjectId() {
		return taskObjectId;
	}

	

	

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getRead() {
		return read;
	}

	public void setRead(String read) {
		this.read = read;
	}

	public String getLike() {
		return like;
	}

	public void setLike(String like) {
		this.like = like;
	}

	public String getFavorite() {
		return favorite;
	}

	public void setFavorite(String favorite) {
		this.favorite = favorite;
	}

	public Date getReadDate() {
		return readDate;
	}

	public void setReadDate(Date readDate) {
		this.readDate = readDate;
	}

	public Date getLikeDate() {
		return likeDate;
	}

	public void setLikeDate(Date likeDate) {
		this.likeDate = likeDate;
	}

	public Date getFavoriteDate() {
		return favoriteDate;
	}

	public void setFavoriteDate(Date favoriteDate) {
		this.favoriteDate = favoriteDate;
	}

    
    
}
