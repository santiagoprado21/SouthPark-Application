package com.southpark.domain;

import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "client")
public class Client implements Serializable {

    private static final long serialVersionUID = 3342963890876774651L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
<<<<<<< HEAD
    @Column(name = "idClient", nullable = false)
    private Long idClient;

    @Column(name = "idTiid")
=======
    @Column(name = "id_client", nullable = false)
    private Long idClient;

    @Column(name = "id_tiid")
>>>>>>> 296cf62c13413836fa4444857f0b45019e106b18
    private String idTiid;

    @Email
    @NotBlank
    @Column(name = "email", nullable = false)
    private String email;

    @NotNull
<<<<<<< HEAD
    @Column(name = "creationDate", nullable = false)
    private Date creationDate;

    @Column(name = "modificationDate")
=======
    @Column(name = "creation_date", nullable = false)
    private Date creationDate;

    @Column(name = "modification_date")
>>>>>>> 296cf62c13413836fa4444857f0b45019e106b18
    private Date modificationDate;

    @NotBlank
    @Column(name = "name", nullable = false)
    private String name;

<<<<<<< HEAD
    @Column(name = "identificationNumber")
    private String identificationNumber;

    @Column(name = "lastName")
=======
    @Column(name = "identification_number")
    private String identificationNumber;

    @Column(name = "last_name")
>>>>>>> 296cf62c13413836fa4444857f0b45019e106b18
    private String lastName;

    @Column(name = "gender")
    private String gender;

    @Column(name = "cellphone")
    private String cellphone;

<<<<<<< HEAD
    // Getters y Setters
=======
>>>>>>> 296cf62c13413836fa4444857f0b45019e106b18
    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
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
<<<<<<< HEAD

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }
=======

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

>>>>>>> 296cf62c13413836fa4444857f0b45019e106b18
}
