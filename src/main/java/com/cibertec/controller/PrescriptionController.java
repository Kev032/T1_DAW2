package com.cibertec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.model.PatientPrescriptionCost;
import com.cibertec.model.Prescription;
import com.cibertec.service.PrescriptionService;


@RestController
@RequestMapping("/prescription")
public class PrescriptionController {
	
	@Autowired
	PrescriptionService preservice;
	
	@GetMapping
	public List<Prescription> list(){
		return preservice.list();
	}
	
	@PostMapping
	public Prescription add(@RequestBody Prescription p) {
		return preservice.add(p);
	}
	
	@PutMapping
	public Prescription update(@RequestBody Prescription p) {
		return preservice.update(p);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		preservice.delete(id);
	}
	
	@GetMapping("/costo-total/{patientId}")
    public ResponseEntity<PatientPrescriptionCost> calculateTotalPrescriptionsCost(@PathVariable Long patientId) {
        PatientPrescriptionCost result = preservice.calculateTotalPrescriptionsCost(patientId);
        return ResponseEntity.ok(result);
    }

}
