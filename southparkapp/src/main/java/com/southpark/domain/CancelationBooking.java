package com.southpark.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cancelation_booking")
public class CancelationBooking {
	
	@Id
	@Column(name = "id_cancelation_booking")
	private String idCancelationBooking;
	
	@Column(name = "id_booking")
    private String idBooking;
	
	@Column(name = "reason")
    private String reason;

}
