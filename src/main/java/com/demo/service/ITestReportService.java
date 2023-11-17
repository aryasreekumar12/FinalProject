package com.demo.service;

import java.util.List;

import com.demo.entity.TestReport;

public interface ITestReportService {
	
	public abstract List<TestReport>findAll();
	public abstract TestReport findById(int theId);
	public abstract void save(TestReport theTestReport);
//	public abstract void deleteById(int repNo);

}
