package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.entity.TestDetails;
import com.demo.repository.ITestDetailsRepository;

@Service
@Transactional
public class TestDetailsServiceImpl implements ITestDetailsService {
	
	private ITestDetailsRepository testDetailsRepository;

	public TestDetailsServiceImpl(ITestDetailsRepository testDetailsRepository) {
		super();
		this.testDetailsRepository = testDetailsRepository;
	}

	@Override
	public List<TestDetails> findAll() {
		return testDetailsRepository.findAll();
	}

	@Override
	public TestDetails findById(int theId) {
		Optional<TestDetails> result = testDetailsRepository.findById(theId);
		TestDetails theTestDetails = null;
		if (result.isPresent()) {
			theTestDetails = result.get();
		} else {
			throw new RuntimeException("Did not find testID " + theId);
		}
		return theTestDetails;
	}



	@Override
	public void save(TestDetails theTestDetails) {
		testDetailsRepository.save(theTestDetails);
	}

	@Override
	public void deleteById(int theId) {
		testDetailsRepository.deleteById(theId);
	}


    
}
