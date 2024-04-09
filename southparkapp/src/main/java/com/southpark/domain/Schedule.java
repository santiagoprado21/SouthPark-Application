package com.southpark.domain;

import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "schedule")
public class Schedule {
	
	@Id
	@Column(name = "id_schedule")
    private String idSchedule;
	
	@Column(name = "day_of_week")
    private Date dayOfWeek;
	
	@Column(name = "month")
    private Date month;
	
	@Column(name = "duration")
	private Integer duration;


}
