package com.southpark.domain;

import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "client")
public class Client {

	@Id
	@Column(name = "id_client")
	private String idClient;
	
	@Column(name = "id_tiid")
    private String idTiid;
	
	@Column(name = "email")
    private String email;
	
	@Column(name = "creation_date")
    private Date creationDate;
	
	@Column(name = "modification_date")
    private Date modificationDate;
	
	@Column(name = "name")
    private String name;
	
	@Column(name = "identification_number")
    private String identificationNumber;
	
	@Column(name = "last_name")
    private String lastName;
	
	@Column(name = "gender")
    private String gender;
	
	@Column(name = "cellphone")
    private String cellphone;
    
}
