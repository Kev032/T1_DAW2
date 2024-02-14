package com.cibertec.service;

import java.util.List;

import com.cibertec.model.Patient;

public interface PatientService{
	
	public List<Patient> list();
	public Patient add(Patient p);
	public Patient update(Patient p);
	public void delete(Long id);

}
