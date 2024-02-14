package com.cibertec.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cibertec.model.PatientPrescriptionCost;
import com.cibertec.model.Prescription;

public interface PrescriptionRepo extends JpaRepository<Prescription, Long> {

	@Query("SELECT NEW com.cibertec.model.PatientPrescriptionCost(p.patientId, p.patientFname, p.patientLname, COALESCE(SUM(r.prescriptionCost), 0.0)) " +
	       "FROM Patient p " +
	       "LEFT JOIN p.prescriptions r " +
	       "WHERE p.patientId = :patientId " +
	       "GROUP BY p.patientId, p.patientFname, p.patientLname")
	PatientPrescriptionCost calculateTotalPrescriptionsCostByPatientId(@Param("patientId") Long patientId);
	
}
