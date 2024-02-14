package com.cibertec.model;

import lombok.Data;

@Data
public class PatientPrescriptionCost {
	
	private Long patientId;
    private String name;
    private String lastname;
    private double totalPrescriptionsCost;
    
    public PatientPrescriptionCost(Long patientId, String name, String lastname, Double totalPrescriptionsCost) {
        this.patientId = patientId;
        this.name = name;
        this.lastname = lastname;
        this.totalPrescriptionsCost = totalPrescriptionsCost;
    }

}
