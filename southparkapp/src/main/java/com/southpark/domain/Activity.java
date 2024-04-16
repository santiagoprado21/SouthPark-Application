package com.southpark.domain;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "activity")
public class Activity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2699286109020262839L;

	@Column(name = "description")
	private String description;
	
	@Column(name = "name")
	private String name;
	
	@Id
	@Column(name = "code" , nullable = false)
	private String code;
	
	

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	
	 
}