package com.cibertec.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.model.Patient;

public interface PatientRepo extends JpaRepository<Patient, Long>{

}
