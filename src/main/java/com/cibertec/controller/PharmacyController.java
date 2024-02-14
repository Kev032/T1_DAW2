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

import com.cibertec.model.Pharmacy;
import com.cibertec.service.PharmacyService;


@RestController
@RequestMapping("/pharmacy")
public class PharmacyController {
	
	@Autowired
	PharmacyService pharmaservice;
	
	@GetMapping
	public List<Pharmacy> list(){
		return pharmaservice.list();
	}
	
	@PostMapping
	public Pharmacy add(@RequestBody Pharmacy p) {
		return pharmaservice.add(p);
	}
	
	@PutMapping
	public Pharmacy update(@RequestBody Pharmacy p) {
		return pharmaservice.update(p);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		pharmaservice.delete(id);
	}

}
