package com.cibertec.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.model.Pharmacy;

public interface PharmacyRepo extends JpaRepository<Pharmacy, Long> {

}
