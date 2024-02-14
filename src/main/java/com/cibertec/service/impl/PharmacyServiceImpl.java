package com.cibertec.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.model.Pharmacy;
import com.cibertec.repo.PharmacyRepo;
import com.cibertec.service.PharmacyService;

@Service
public class PharmacyServiceImpl implements PharmacyService {
	
	@Autowired
	PharmacyRepo pharmarepo;

	@Override
	public List<Pharmacy> list() {
		return pharmarepo.findAll();
	}

	@Override
	public Pharmacy add(Pharmacy p) {
		return pharmarepo.save(p);
	}

	@Override
	public Pharmacy update(Pharmacy p) {
		return pharmarepo.save(p);
	}

	@Override
	public void delete(Long id) {
		pharmarepo.deleteById(id);
		
	}

}
