package com.objectwing.cfdemo.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="roadmap")
public class Roadmap implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer roadmapId;
	
	@ManyToOne
	private Person createBy;
	
	@ManyToOne
	private Person updateBy;
	
	@OneToMany(mappedBy="roadmap",cascade = CascadeType.ALL)
	@OrderBy(value = "sequence ASC") 
	private List<Milestone> milestones;
	
	private Date createDate;	
	private Date updateDate;	
	private String title;
	private String description;
	
	public Integer getRoadmapId() {
		return roadmapId;
	}
	public void setRoadmapId(Integer roadmapId) {
		this.roadmapId = roadmapId;
	}
	public Person getCreateBy() {
		return createBy;
	}
	public void setCreateBy(Person createBy) {
		this.createBy = createBy;
	}
	public Person getUpdateBy() {
		return updateBy;
	}
	public void setUpdateBy(Person updateBy) {
		this.updateBy = updateBy;
	}
	public List<Milestone> getMilestones() {
		return milestones;
	}
	public void setMilestones(List<Milestone> milestones) {
		this.milestones = milestones;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
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
    
}
