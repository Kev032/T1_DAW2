package com.cibertec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.model.Patient;
import com.cibertec.service.PatientService;

@RestController
@RequestMapping("/patient")
public class PatientController {
	
	@Autowired
	PatientService patientservice;
	
	@GetMapping
	public List<Patient> list(){
		return patientservice.list();
	}
	
	@PostMapping
	public Patient add(@RequestBody Patient p) {
		return patientservice.add(p);
	}
	
	@PutMapping
	public Patient update(@RequestBody Patient p) {
		return patientservice.update(p);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		patientservice.delete(id);
	}

}
