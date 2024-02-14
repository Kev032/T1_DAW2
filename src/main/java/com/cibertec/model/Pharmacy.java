package com.cibertec.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "pharmacy")
public class Pharmacy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pharmacyId;

    private String pharmacyName;
    private String pharmacyAddress;
    private String pharmacyPhoneNumber;

    @OneToMany(mappedBy = "pharmacy") // 
    private List<Prescription> prescriptions;

    @ManyToOne
    @JoinColumn(name = "patient_id") // 
    private Patient patient;

}