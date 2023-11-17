package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.entity.TestList;
import com.demo.repository.ITestListRepository;

@Service
@Transactional
public class TestListServiceImpl implements ITestListService {
	
	private ITestListRepository testListRepository;

	public TestListServiceImpl(ITestListRepository testListRepository) {
		super();
		this.testListRepository = testListRepository;
	}

	@Override
	public List<TestList> findAll() {
		return testListRepository.findAll();
	}


	@Override
	public TestList findById(int theId) {
		Optional<TestList> result = testListRepository.findById(theId);
		TestList theTestList = null;
		if (result.isPresent()) {
			theTestList = result.get();
		} else {
			throw new RuntimeException("Did not find testID " + theId);
		}
		return theTestList;
	}

	@Override
	public void save(TestList theTestList) {
		testListRepository.save(theTestList);
		
	}

}
