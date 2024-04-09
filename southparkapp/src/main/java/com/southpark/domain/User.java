package com.southpark.domain;

import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	
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
    private User creatorUser;
	
	@Column(name = "modified_user")
    private User modifierUser;
    
    
    

}
