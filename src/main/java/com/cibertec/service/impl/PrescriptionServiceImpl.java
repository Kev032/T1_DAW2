package com.cibertec.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.model.PatientPrescriptionCost;
import com.cibertec.model.Prescription;
import com.cibertec.repo.PrescriptionRepo;
import com.cibertec.service.PrescriptionService;

@Service
public class PrescriptionServiceImpl implements PrescriptionService {

	@Autowired
	PrescriptionRepo presrepo;
	
	@Override
	public List<Prescription> list() {
		return presrepo.findAll();
	}

	@Override
	public Prescription add(Prescription p) {
		return presrepo.save(p);
	}

	@Override
	public Prescription update(Prescription p) {
		return presrepo.save(p);
	}

	@Override
	public void delete(Long id) { 
		presrepo.deleteById(id);
	}

	@Override
	public PatientPrescriptionCost calculateTotalPrescriptionsCost(Long patientId) {
		return presrepo.calculateTotalPrescriptionsCostByPatientId(patientId);
	}
}
