package com.demo.service;


import java.sql.Date;
//import java.util.Date;
import java.util.List;

import com.demo.entity.PatientDetails;
import com.demo.entity.Prescription;
import com.demo.entity.TestList;
import com.demo.entity.TestReport;


public interface IDoctorService {
	
	public abstract List <PatientDetails> findPatientByIdAndName(int stfId, Date currentDate);
//	public abstract PatientDetails findPatient(int patId);
	public abstract PatientDetails findById(int paId); 
	public abstract Prescription findPrescById(int patId);
	public abstract void save(Prescription thePrescription);
	public abstract TestReport findRepById(int paId);
	public abstract void saveTest(TestList theTestList);
	

}
