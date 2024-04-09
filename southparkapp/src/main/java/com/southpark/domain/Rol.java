package com.southpark.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "rol")
public class Rol {
	
	@Column(name = "name")
	private String name;
	
	@Id
	@Column(name = "code")
	private String code;

}
