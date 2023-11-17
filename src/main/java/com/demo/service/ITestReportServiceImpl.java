package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.entity.TestDetails;
import com.demo.entity.TestReport;
import com.demo.repository.ITestReportRepository;

@Service
@Transactional
public class ITestReportServiceImpl implements ITestReportService{
	
	private ITestReportRepository testReportRepository;
	
	public ITestReportServiceImpl(ITestReportRepository testReportRepository) {
		super();
		this.testReportRepository = testReportRepository;
	}


	@Override
	public List<TestReport> findAll() {
		
		return testReportRepository.findAll();
	}

	@Override
	public TestReport findById(int theId) {
		Optional<TestReport> result = testReportRepository.findById(theId);
		TestReport theTestReport = null;
		if (result.isPresent()) {
			theTestReport = result.get();
		} else {
			throw new RuntimeException("Did not find testID " + theId);
		}
		return theTestReport;
	}

	@Override
	public void save(TestReport theTestReport) {
		testReportRepository.save(theTestReport);
		
	}

}

