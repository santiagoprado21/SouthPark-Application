package com.southpark.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "avtivity_details")
public class ActivityDetails {
	
	@Id
	@Column(name = "id_activity_details")
	private String idActivityDetails;
	
	@Column(name = "code")
	private String code;
	
	@Column(name = "details")
	private String details;
	
	@Column(name = "cost")
	private double cost;
	
	@Column(name = "status")
	private boolean status;
	    
}
