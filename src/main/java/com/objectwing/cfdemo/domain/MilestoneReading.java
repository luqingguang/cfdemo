package com.objectwing.cfdemo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;


@Entity
@Table(name="milestone_reading")
public class MilestoneReading implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer milestoneReadingId;
	
	@ManyToOne
	private Milestone milestone;
	
	@ManyToOne
	private Reading reading;
	
	private Integer sequence;

	public Integer getMilestoneReadingId() {
		return milestoneReadingId;
	}

	public void setMilestoneReadingId(Integer milestoneReadingId) {
		this.milestoneReadingId = milestoneReadingId;
	}

	public Milestone getMilestone() {
		return milestone;
	}

	public void setMilestone(Milestone milestone) {
		this.milestone = milestone;
	}

	public Integer getSequence() {
		return sequence;
	}

	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

    
    
}
