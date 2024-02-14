package com.cibertec.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "patient")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long patientId;

    private String patientFname;
    private String patientLname;
    private String patientAddress;
    private String patientPhoneNumber;

    @OneToMany(mappedBy = "patient")
    @JsonIgnore
    private List<Appointment> appointments;

    @OneToMany(mappedBy = "patient")
    @JsonIgnore
    private List<Room> rooms;

    @OneToMany(mappedBy = "patient")
    @JsonIgnore
    private List<Prescription> prescriptions;

    @OneToMany(mappedBy = "patient")
    @JsonIgnore
    private List<Invoice> invoices;
    
}
