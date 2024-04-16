package com.southpark.domain;

import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "client")
public class Client implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3342963890876774651L;

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
	
	

	public String getIdClient() {
		return idClient;
	}

	public void setIdClient(String idClient) {
		this.idClient = idClient;
	}

	public String getIdTiid() {
		return idTiid;
	}

	public void setIdTiid(String idTiid) {
		this.idTiid = idTiid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getModificationDate() {
		return modificationDate;
	}

	public void setModificationDate(Date modificationDate) {
		this.modificationDate = modificationDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdentificationNumber() {
		return identificationNumber;
	}

	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
    
}
