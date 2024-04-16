package com.southpark.domain;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "availability")
public class Availability implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5618883616436983491L;

	@Id
	@Column(name = "id_availability")
	private String idAvailability;
	
	@Column(name = "id_physical_space")
    private String idPhysicalSpace;
	
	@Column(name = "id_schedule")
    private String idSchedule;
	
	@Column(name = "available_date")
    private Date availableDate;
	
	

	public String getIdAvailability() {
		return idAvailability;
	}

	public void setIdAvailability(String idAvailability) {
		this.idAvailability = idAvailability;
	}

	public String getIdPhysicalSpace() {
		return idPhysicalSpace;
	}

	public void setIdPhysicalSpace(String idPhysicalSpace) {
		this.idPhysicalSpace = idPhysicalSpace;
	}

	public String getIdSchedule() {
		return idSchedule;
	}

	public void setIdSchedule(String idSchedule) {
		this.idSchedule = idSchedule;
	}

	public Date getAvailableDate() {
		return availableDate;
	}

	public void setAvailableDate(Date availableDate) {
		this.availableDate = availableDate;
	}

}
