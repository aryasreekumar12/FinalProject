package com.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TestDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int testId;
	private String testName;
	private int testPrice;
	private boolean isActive;
	public TestDetails() {
		super();
	}
	public TestDetails(int testId, String testName, int testPrice, boolean isActive) {
		super();
		this.testId = testId;
		this.testName = testName;
		this.testPrice = testPrice;
		this.isActive = isActive;
	}
	public int getTestId() {
		return testId;
	}
	public void setTestId(int testId) {
		this.testId = testId;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	public int getTestPrice() {
		return testPrice;
	}
	public void setTestPrice(int testPrice) {
		this.testPrice = testPrice;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
}