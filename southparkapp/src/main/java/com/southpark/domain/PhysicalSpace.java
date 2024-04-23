package com.southpark.domain;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "physical_space")
public class PhysicalSpace implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1264115402204308018L;

	@Id
	@Column(name = "id_physical_space")
	private String idPhysicalSpace;
	
	@Column(name = "name")
    private String name;
	
	@Column(name = "description")
    private String description;
	
	@Column(name = "location")
    private String location;
	
	@Column(name = "capacity")
    private String capacity;

	

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public String getIdPhysicalSpace() {
		return idPhysicalSpace;
	}

	public void setIdPhysicalSpace(String idPhysicalSpace) {
		this.idPhysicalSpace = idPhysicalSpace;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
   
}
