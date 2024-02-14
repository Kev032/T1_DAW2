package com.cibertec.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.model.Patient;
import com.cibertec.repo.PatientRepo;
import com.cibertec.service.PatientService;

@Service
public class PatientServicerImpl implements PatientService {

	@Autowired
	PatientRepo patientrepo;
	
	@Override
	public List<Patient> list() {
		return patientrepo.findAll();
	}

	@Override
	public Patient add(Patient p) {
		return patientrepo.save(p);
	}

	@Override
	public Patient update(Patient p) {
		return patientrepo.save(p);
	}

	@Override
	public void delete(Long id) {
		patientrepo.deleteById(id);
		
	}

}
