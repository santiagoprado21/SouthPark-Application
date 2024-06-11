package com.southpark.domain;

import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "schedule")
public class Schedule implements Serializable {
	
	private static final long serialVersionUID = -7758872899194781453L;

	@Id
	@Column(name = "id_schedule")
    private String idSchedule;
	
	@Column(name = "day_of_week")
    private String dayOfWeek;
	
	@Column(name = "month")
    private String month;
	
	@Column(name = "ini_hour")
	private Date iniHour;

	@Column(name = "end_hour")
	private Date endHour;
	

	public Date getIniHour() {
		return iniHour;
	}

	public void setIniHour(Date iniHour) {
		this.iniHour = iniHour;
	}

	public Date getEndHour() {
		return endHour;
	}

	public void setEndHour(Date endHour) {
		this.endHour = endHour;
	}

	public String getIdSchedule() {
		return idSchedule;
	}

	public void setIdSchedule(String idSchedule) {
		this.idSchedule = idSchedule;
	}

	public String getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

}
