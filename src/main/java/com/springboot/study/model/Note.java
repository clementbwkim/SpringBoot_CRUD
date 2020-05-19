package com.springboot.study.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "NOTES")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createedAt","updatedAt"}, allowGetters = true)
public class Note implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "notes_seq")
	@SequenceGenerator(sequenceName = "sequence_notes", allocationSize = 1, name = "notes_seq")
	private Long id;
	
	@NotBlank
	private String title;
	
	@NotBlank
	private String content;
	
	@Column(nullable = false, updatable = false)
//	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	private Timestamp insertdate;
	
	@Column(nullable = false, updatable = false)
//	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private Timestamp updatedate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getInsertdate() {
		return insertdate;
	}

	public void setInsertdate(Timestamp insertdate) {
		this.insertdate = insertdate;
	}

	public Timestamp getUpdatedate() {
		return updatedate;
	}

	public void setUpdatedate(Timestamp updatedate) {
		this.updatedate = updatedate;
	}
	
	
	
	
	
	
	
	
}
