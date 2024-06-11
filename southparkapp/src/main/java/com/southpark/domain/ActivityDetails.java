package com.southpark.domain;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "activity_details")
public class ActivityDetails implements Serializable {

    private static final long serialVersionUID = 2826559036704876556L;

    @Id
    @Column(name = "idActivityDetails", nullable = false, length = 255)
    private String idActivityDetails;

    @ManyToOne
    @JoinColumn(name = "code", referencedColumnName = "code")
    private Activity activity;

    @Column(name = "details", columnDefinition = "TEXT")
    private String details;

    @Column(name = "cost", nullable = false)
    private double cost;

    @Column(name = "status", length = 255)
    private String status;

    // Getters y Setters
    public String getIdActivityDetails() {
        return idActivityDetails;
    }

    public void setIdActivityDetails(String idActivityDetails) {
        this.idActivityDetails = idActivityDetails;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
