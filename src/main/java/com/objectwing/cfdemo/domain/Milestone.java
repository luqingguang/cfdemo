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
@Table(name="milestone")
public class Milestone implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public static final String MILESTONE_LEVEL_KNOWN = "Known";
	public static final String MILESTONE_LEVEL_SKILLED = "Skilled";
	public static final String MILESTONE_LEVEL_EXPERT = "Expert";
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer milestoneId;
	
	@ManyToOne
	private Person createBy;
	
	@ManyToOne
	private Person updateBy;
	
	@ManyToOne
	private Roadmap roadmap;
	
	@OneToMany(mappedBy="milestone",cascade = CascadeType.ALL)
	@OrderBy(value = "sequence ASC") 
	private List<MilestoneReading> milestoneReadings;
	
	private Integer sequence;
	private Date createDate;	
	private Date updateDate;
	private String level;
	private String title;
	private String description;
	public Integer getMilestoneId() {
		return milestoneId;
	}
	public void setMilestoneId(Integer milestoneId) {
		this.milestoneId = milestoneId;
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
	public List<MilestoneReading> getMilestoneReadings() {
		return milestoneReadings;
	}
	public void setMilestoneReadings(List<MilestoneReading> milestoneReadings) {
		this.milestoneReadings = milestoneReadings;
	}
	public Integer getSequence() {
		return sequence;
	}
	public void setSequence(Integer sequence) {
		this.sequence = sequence;
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
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
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

	public Roadmap getRoadmap() {
		return roadmap;
	}
	public void setRoadmap(Roadmap roadmap) {
		this.roadmap = roadmap;
	}
    
}
