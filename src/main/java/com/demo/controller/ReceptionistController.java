package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.PatientDetails;
import com.demo.entity.PatientList;
import com.demo.service.IReceptionistService;

@CrossOrigin

@RestController

@RequestMapping("/api")

public class ReceptionistController {

	private IReceptionistService iReceptionistService;

	@Autowired

	public ReceptionistController(IReceptionistService iReceptionistService) {

		this.iReceptionistService = iReceptionistService;

	}

	@GetMapping("/receptionists")

	public List<PatientDetails> findAll() {

		return iReceptionistService.findAll();

	}

	@GetMapping("/receptionists/{patId}")

	public PatientDetails getEmployee(@PathVariable int patId) {

		PatientDetails thePatientDetails = iReceptionistService.findById(patId);

		if (thePatientDetails == null) {

			throw new RuntimeException("patient id not found-" + patId);

		}

		return thePatientDetails;

	}

	@PostMapping("/receptionists")

	public PatientDetails addPatient(@RequestBody PatientDetails thePatientDetails) {

		thePatientDetails.setPatId(0);

		iReceptionistService.save(thePatientDetails);

		return thePatientDetails;

	}

	@PutMapping("/receptionists/{patId}")

	public PatientDetails updatePatient(@PathVariable int patId, @RequestBody PatientDetails thePatientDetails) {

		PatientDetails pat = iReceptionistService.findById(patId);

		if (thePatientDetails == null) {

			throw new RuntimeException("patient id not found-" + patId);

		}

		pat.setPatFName(thePatientDetails.getPatFName());

		pat.setPatAdd(thePatientDetails.getPatAdd());

		pat.setPatBldGrp(thePatientDetails.getPatBldGrp());

		pat.setPatDob(thePatientDetails.getPatDob());

		pat.setPatAge(thePatientDetails.getPatAge());

		pat.setPatMob(thePatientDetails.getPatMob());

		pat.setPatEmg(thePatientDetails.getPatEmg());

		pat.setPatGend(thePatientDetails.getPatGend());

		pat.setPatEmail(thePatientDetails.getPatEmail());

		iReceptionistService.save(pat);

		return pat;

	}

	@DeleteMapping("/receptionists/{patId}")

	public String deleteEmployee(@PathVariable int patId) {

		PatientDetails thePatientDetails = iReceptionistService.findById(patId);

		if (thePatientDetails == null) {

			throw new RuntimeException("patient id not found-" + patId);

		}

		iReceptionistService.deleteById(patId);

		return "Deleted patientid: " + patId;

	}

	@GetMapping("/list")
	public List<PatientList> findAllList() {
		return iReceptionistService.findAllList();
	}

}