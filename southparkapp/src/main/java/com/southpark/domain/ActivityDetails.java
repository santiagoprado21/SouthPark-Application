package com.southpark.domain;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "avtivity_details")
public class ActivityDetails implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2826559036704876556L;

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
	
	

	public String getIdActivityDetails() {
		return idActivityDetails;
	}

	public void setIdActivityDetails(String idActivityDetails) {
		this.idActivityDetails = idActivityDetails;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
