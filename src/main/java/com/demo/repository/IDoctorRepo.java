package com.demo.repository;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.demo.entity.PatientDetails;
import com.demo.entity.PatientList;

public interface IDoctorRepo extends JpaRepository<PatientDetails, Integer> {
	
	

	@Query("from PatientDetails where patId=?1")
	public PatientDetails findPatient(int patId);
}
