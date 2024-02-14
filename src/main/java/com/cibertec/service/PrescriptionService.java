package com.cibertec.service;

import java.util.List;

import com.cibertec.model.PatientPrescriptionCost;
import com.cibertec.model.Prescription;


public interface PrescriptionService {

	public List<Prescription> list();
	public Prescription add(Prescription p);
	public Prescription update(Prescription p);
	public void delete(Long id);
    public PatientPrescriptionCost calculateTotalPrescriptionsCost(Long patientId);

}
