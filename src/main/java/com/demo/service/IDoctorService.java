package com.demo.service;

import java.time.LocalDate;

import com.demo.entity.PatientDetails;
import com.demo.entity.Prescription;
import com.demo.entity.TestList;
import com.demo.entity.TestReport;


public interface IDoctorService {
	
	public abstract PatientDetails findPatientByIdAndName(int stfId,LocalDate appDate);
	public abstract PatientDetails findPatient(int patId);
	public abstract PatientDetails findById(int paId); 
	public abstract Prescription findPrescById(int patId);
	public abstract void save(Prescription thePrescription);
	public abstract TestReport findRepById(int paId);
	public abstract void saveTest(TestList theTestList);
	

}
