package com.southpark.domain;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cancelation_booking")
public class CancelationBooking implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_cancelation_booking")
	private String idCancelationBooking;
	
	@Column(name = "id_booking")
    private String idBooking;
	
	@Column(name = "reason")
    private String reason;
	
	

	public String getIdCancelationBooking() {
		return idCancelationBooking;
	}

	public void setIdCancelationBooking(String idCancelationBooking) {
		this.idCancelationBooking = idCancelationBooking;
	}

	public String getIdBooking() {
		return idBooking;
	}

	public void setIdBooking(String idBooking) {
		this.idBooking = idBooking;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

}
