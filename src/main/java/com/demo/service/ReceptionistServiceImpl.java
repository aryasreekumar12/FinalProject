package com.demo.service;



import java.util.List;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.demo.entity.PatientDetails;
import com.demo.entity.PatientList;
import com.demo.repository.IPatientListRepository;
import com.demo.repository.IReceptionistRepository;

@Service

public class ReceptionistServiceImpl implements IReceptionistService {

	

	private IReceptionistRepository ireceptionistRepository;
	private IPatientListRepository iPatientListRepository;

	

	public ReceptionistServiceImpl(IReceptionistRepository ireceptionistRepository,
			IPatientListRepository iPatientListRepository) {
		super();
		this.ireceptionistRepository = ireceptionistRepository;
		this.iPatientListRepository = iPatientListRepository;
	}



	@Override

	public List<PatientDetails> findAll() {

		return ireceptionistRepository.findAll();

		

	}



	@Override

	public PatientDetails findById(int theId) {

		Optional<PatientDetails>result=ireceptionistRepository.findById(theId);

		PatientDetails thePatientDetails=null;

		if(result.isPresent()) {

			thePatientDetails=result.get();

		}

		else {

			throw new RuntimeException("Did not find patient Id "+theId);

		}

		return thePatientDetails;

	}

	



	@Override

	public void save(PatientDetails thePatientDetails) {

		ireceptionistRepository.save(thePatientDetails);

		

		

	}



	@Override

	public void deleteById(int theId) {

		

		ireceptionistRepository.deleteById(theId);

			

		}
	
	@Override
	public void save(PatientList thePatientList) {
		iPatientListRepository.save(thePatientList);
	}
	
	@Override
	public List<PatientList>findAllList(){
		return iPatientListRepository.findAll();
	}

	



}