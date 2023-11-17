package com.demo.service;

import java.util.List;

import com.demo.entity.TestList;

public interface ITestListService {
	
	public abstract List<TestList>findAll();
	public abstract TestList findById(int theId);
	public abstract void save(TestList theTestList);
	

}
