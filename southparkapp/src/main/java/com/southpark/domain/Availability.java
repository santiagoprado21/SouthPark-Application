package com.southpark.domain;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "availability")
public class Availability {
	
	@Id
	@Column(name = "id_availability")
	private String idAvailability;
	
	@Column(name = "id_physical_space")
    private String idPhysicalSpace;
	
	@Column(name = "id_schedule")
    private String idSchedule;
	
	@Column(name = "available_date")
    private Date availableDate;

}
