package com.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.demo.entity.PatientDetails;


public interface IDoctorRepo extends JpaRepository<PatientDetails, Integer> {
	
	

	@Query("from PatientDetails where patId=?1")
	public PatientDetails findPatient(int patId);
}
