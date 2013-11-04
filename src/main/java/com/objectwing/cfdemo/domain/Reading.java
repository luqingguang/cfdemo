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
@Table(name="reading")
public class Reading implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public static final String READING_TYPE_ARTICLE = "Article";
	public static final String READING_TYPE_BOOK = "Book";
	public static final String READING_TYPE_SEMINAR = "Seminar";

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer readingId;
	
	@ManyToOne
	private Person createBy;
	
	@ManyToOne
	private Person updateBy;
	
	private Date createDate;	
	private Date updateDate;	
	private String title;
	private String description;
	private String readingType;
	private String uri;
	
	public Integer getReadingId() {
		return readingId;
	}
	public void setReadingId(Integer readingId) {
		this.readingId = readingId;
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
	public String getReadingType() {
		return readingType;
	}
	public void setReadingType(String readingType) {
		this.readingType = readingType;
	}
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	

    
    
}
