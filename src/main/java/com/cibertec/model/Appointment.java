package com.cibertec.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "appoiment")
public class Appointment {

	@Id
    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

	@Id
    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    private Date date;
    private Date time;

}