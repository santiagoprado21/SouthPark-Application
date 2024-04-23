package com.southpark.domain;

import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "my_user")
public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6219699403550670048L;

	@Id
	@Column(name = "id_user")
	private String idUser;
	
	@Column(name = "creation_date")
    private Date creationDate;
	
	@Column(name = "modification_date")
    private Date modificationDate;
	
	@Column(name = "login")
    private String login;
	
	@Column(name = "name")
    private String name;
	
	@Column(name = "password")
    private String password;
	
	@Column(name = "creator_user")
    private String creatorUser;
	
	@Column(name = "modifier_user")
    private String modifierUser;

	public String getIdUser() {
		return idUser;
	}

	public void setIdUser(String idUser) {
		this.idUser = idUser;
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

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCreatorUser() {
		return creatorUser;
	}

	public void setCreatorUser(String creatorUser) {
		this.creatorUser = creatorUser;
	}

	public String getModifierUser() {
		return modifierUser;
	}

	public void setModifierUser(String modifierUser) {
		this.modifierUser = modifierUser;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}

