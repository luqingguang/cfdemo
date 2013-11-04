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
	public static final String TASK_STATUS_CREATE = "Create";
	public static final String TASK_STATUS_COMPLETE = "Complete";

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer taskId;	
	
	private String taskType;
	
	private Integer taskObjectId;
	
	private Integer parentObjectId;
	
	private Integer sequence;
	
	private String status;
	
	private Date createDate;
	
	private Date completeDate;

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

	public void setTaskObjectId(Integer taskObjectId) {
		this.taskObjectId = taskObjectId;
	}

	public Integer getParentObjectId() {
		return parentObjectId;
	}

	public void setParentObjectId(Integer parentObjectId) {
		this.parentObjectId = parentObjectId;
	}

	public Integer getSequence() {
		return sequence;
	}

	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getCompleteDate() {
		return completeDate;
	}

	public void setCompleteDate(Date completeDate) {
		this.completeDate = completeDate;
	}    
    
}
