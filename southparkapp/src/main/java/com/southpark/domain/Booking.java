package com.southpark.domain;

import java.sql.Timestamp;

import java.util.Date;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "booking")
public class Booking {

	@Id
	@Column(name = "id_booking")
	private String idBooking;
	
	@Column(name = "id_client")
    private String idClient;
	
	@Column(name = "id_activity")
    private String idActivity;
	
	@Column(name = "booking_date")
    private Date bookingDate;
	
	@Column(name = "duration")
    private int duration;
	
	@Column(name = "hour")
    private Timestamp hour;
	
	@Column(name = "status")
    private String status;
	
	@Column(name = "description")
    private String description;
    
}
