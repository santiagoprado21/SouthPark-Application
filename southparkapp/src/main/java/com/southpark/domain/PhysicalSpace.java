package com.southpark.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "physical_space")
public class PhysicalSpace {
	
	@Id
	@Column(name = "id_physical_space")
	private String idPhysicalSpace;
	
	@Column(name = "name")
    private String name;
	
	@Column(name = "description")
    private String description;
	
	@Column(name = "location")
    private String location;
   
}
