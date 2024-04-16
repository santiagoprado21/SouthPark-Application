package com.southpark.domain;

import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "schedule")
public class Schedule implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7758872899194781453L;

	@Id
	@Column(name = "id_schedule")
    private String idSchedule;
	
	@Column(name = "day_of_week")
    private Date dayOfWeek;
	
	@Column(name = "month")
    private Date month;
	
	@Column(name = "duration")
	private Integer duration;
	
	

	public String getIdSchedule() {
		return idSchedule;
	}

	public void setIdSchedule(String idSchedule) {
		this.idSchedule = idSchedule;
	}

	public Date getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(Date dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	public Date getMonth() {
		return month;
	}

	public void setMonth(Date month) {
		this.month = month;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}


}
