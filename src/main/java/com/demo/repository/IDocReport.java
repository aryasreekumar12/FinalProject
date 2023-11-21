package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

//import com.demo.entity.PatientDetails;
//import com.demo.entity.Prescription;
import com.demo.entity.TestReport;

public interface IDocReport extends JpaRepository <TestReport, Integer>{
	@Query("from TestReport where patId=?1")
	public TestReport findReport(int patId);

}
