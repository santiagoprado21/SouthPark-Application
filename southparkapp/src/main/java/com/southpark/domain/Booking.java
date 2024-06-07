package com.southpark.domain;

import java.io.Serializable;
import java.sql.Timestamp;

import java.util.Date;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "booking")
public class Booking implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_booking")
	private Long idBooking;
	
	@Column(name = "id_client")
    private Long idClient;
	
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
	
	
	

	public Long getIdBooking() {
		return idBooking;
	}

	public void setIdBooking(Long idBooking) {
		this.idBooking = idBooking;
	}

	public Long getIdClient() {
		return idClient;
	}

	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}

	public String getIdActivity() {
		return idActivity;
	}

	public void setIdActivity(String idActivity) {
		this.idActivity = idActivity;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Timestamp getHour() {
		return hour;
	}

	public void setHour(Timestamp hour) {
		this.hour = hour;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
    
}
