package com.demo.controller;

import java.sql.Date;
import java.time.LocalDate;
//import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.PatientDetails;
import com.demo.entity.Prescription;
import com.demo.entity.TestList;
import com.demo.entity.TestReport;
import com.demo.service.IDoctorService;


@CrossOrigin
@RestController
@RequestMapping("/api")
public class DoctorController {
    private IDoctorService iDoctorService;

    public DoctorController(IDoctorService iDoctorService) {
        super();
        this.iDoctorService = iDoctorService;
    }
    @GetMapping("/appointments/{stfId}")
    public List<PatientDetails> findAll(@PathVariable int stfId) {
        Date currentDate = java.sql.Date.valueOf(LocalDate.now()); // Convert to java.util.Date
        return iDoctorService.findPatientByIdAndName(stfId, currentDate);
    }
	@GetMapping("/patients/{patId}")
	public PatientDetails getPatient(@PathVariable int patId){
		PatientDetails thePatientDetails=iDoctorService.findById(patId);
        if(thePatientDetails==null) {
        	throw new RuntimeException("patient id not found-"+patId);
        }
        return thePatientDetails;	
}
	@GetMapping("/prescriptions/{patId}")
	public Prescription getPatientPresc(@PathVariable int patId){
		Prescription thePrescription=iDoctorService.findPrescById(patId);
        if(thePrescription==null) {
        	throw new RuntimeException("patient id not found-"+patId);
        }
        return thePrescription;	
}
	  @PostMapping("/prescriptions")
	    public Prescription addPrescription(@RequestBody Prescription thePrescription) {
	        thePrescription.setPrescId(0);
	        iDoctorService.save(thePrescription);
	        return thePrescription;
	    }

	    @PostMapping("/tests")
	    public TestList addTest(@RequestBody TestList theTestList) {
//	        theTestList.setTestId(0);
	        iDoctorService.saveTest(theTestList);
	        return theTestList;
	    }
	    @GetMapping("/reports/{patId}")
		public TestReport getPatientReport(@PathVariable int patId){
	    	TestReport theTestReport=iDoctorService.findRepById(patId);
	        if(theTestReport==null) {
	        	throw new RuntimeException("patient id not found-"+patId);
	        }
	        return theTestReport;	
	

}
}