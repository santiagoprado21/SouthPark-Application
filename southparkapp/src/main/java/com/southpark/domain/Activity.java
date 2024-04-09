package com.southpark.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "activity")
public class Activity {

	@Column(name = "description")
	private String description;
	
	@Column(name = "name")
	private String name;
	
	@Id
	@Column(name = "code" , nullable = false)
	private String code;
	 
}
