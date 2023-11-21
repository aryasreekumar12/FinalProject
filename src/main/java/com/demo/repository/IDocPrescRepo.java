package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

//import com.demo.entity.PatientDetails;
import com.demo.entity.Prescription;

public interface IDocPrescRepo extends JpaRepository<Prescription, Integer> {
	@Query("from Prescription where patId=?1")
	public Prescription findPresc(int patId);

}
