package com.demo.service;

import java.util.List;



import com.demo.entity.PatientDetails;
import com.demo.entity.PatientList;

public interface IReceptionistService {

	public abstract List<PatientDetails>findAll();

	public abstract PatientDetails findById(int theId);

	public abstract void save(PatientDetails thePatientDetails);

	public abstract void deleteById(int theId);
	
	public abstract List<PatientList>findAllList();
	public abstract void saveList(PatientList thePatientList);

}