package com.demo.service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
//import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.PatientDetails;
import com.demo.entity.Prescription;
import com.demo.entity.TestList;
import com.demo.entity.TestReport;
import com.demo.repository.IDocListRepo;
import com.demo.repository.IDocPrescRepo;
import com.demo.repository.IDocReport;
import com.demo.repository.IDocTestRepo;
import com.demo.repository.IDoctorRepo;

import jakarta.transaction.Transactional;

@Service
public class DoctorService implements IDoctorService{
	
	private IDoctorRepo iDoctorRepo;
	private IDocPrescRepo iDocPrescRepo;
	private IDocReport iDocReport; 
	private IDocTestRepo iDocTestRepo; 

	private IDocListRepo iDocListRepo;
	
	

	@Autowired
	public DoctorService(IDoctorRepo iDoctorRepo, IDocPrescRepo iDocPrescRepo, IDocReport iDocReport,
			IDocTestRepo iDocTestRepo, IDocListRepo iDocListRepo) {
		super();
		this.iDoctorRepo = iDoctorRepo;
		this.iDocPrescRepo = iDocPrescRepo;
		this.iDocReport = iDocReport;
		this.iDocTestRepo = iDocTestRepo;
		this.iDocListRepo = iDocListRepo;
	}

	@Override
	public List<PatientDetails> findPatientByIdAndName(int stfId, Date appDate) {
	    List<Integer> patIdList = iDocListRepo.findPatientByIdAndName(stfId, appDate);
	    List<PatientDetails> patientDetailsList = new ArrayList<>();

	    if (patIdList != null) {
	        for (Integer patId : patIdList) {
	        	System.out.println(patId);
	            PatientDetails patientDetails = iDoctorRepo.findPatient(patId);
	            if (patientDetails != null) {
	                patientDetailsList.add(patientDetails);
	            }
	        }
	    }

	    return patientDetailsList;
	}
//	
//	@Override
//	public PatientDetails findPatient(int patId) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public PatientDetails findById(int patId) {
		Optional<PatientDetails>result=iDoctorRepo.findById(patId);
		PatientDetails thePatientDetails=null;
		if(result.isPresent()) {
			thePatientDetails=result.get();
		}
		else {
			throw new RuntimeException("Did not find patient Id "+patId);
		}
		return thePatientDetails;
	}


	@Override
	public Prescription findPrescById(int patId) {
		Optional <Prescription> result=Optional.ofNullable(iDocPrescRepo.findPresc(patId));
		Prescription thePrescription=null;
		if(result.isPresent()) {
			thePrescription=result.get();
		}
		else {
			throw new RuntimeException("Did not find patient Id "+patId);
		}
		return thePrescription;
	}

	
	@Override
	public void save(Prescription thePrescription) {
		iDocPrescRepo.save(thePrescription);
		
		
	}

	@Override
	public TestReport findRepById(int patId) {
		Optional<TestReport>result=Optional.ofNullable(iDocReport.findReport(patId));
		TestReport theTestReport=null;
		if(result.isPresent()) {
			theTestReport=result.get();
		}
		else {
			throw new RuntimeException("Did not find patient Id "+patId);
		}
		return theTestReport;
	}

	@Override
	public void saveTest(TestList theTestList) {
		iDocTestRepo.save(theTestList);
		
	}

}
