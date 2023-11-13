package com.demo.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class TestList {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int testNo;
	private int patId;
	@ManyToOne
    @JoinColumn(name = "patId",insertable=false,updatable=false)
    private PatientDetails patientDetails;
	private String patFName;
	private String stfFName;
	 @ManyToOne
	    @JoinColumn(name = "stfId",insertable=false,updatable=false)
	private StaffDetails staffDetails;
	private Date testDate;
	private int testId;
	private String testName;
	private boolean isActive;
	public TestList() {
		super();
	}
	public TestList(int testNo, int patId, PatientDetails patientDetails, String patFName, String stfFName,
			StaffDetails staffDetails, Date testDate, int testId, String testName, boolean isActive) {
		super();
		this.testNo = testNo;
		this.patId = patId;
		this.patientDetails = patientDetails;
		this.patFName = patFName;
		this.stfFName = stfFName;
		this.staffDetails = staffDetails;
		this.testDate = testDate;
		this.testId = testId;
		this.testName = testName;
		this.isActive = isActive;
	}
	public int getTestNo() {
		return testNo;
	}
	public void setTestNo(int testNo) {
		this.testNo = testNo;
	}
	public int getPatId() {
		return patId;
	}
	public void setPatId(int patId) {
		this.patId = patId;
	}
	public PatientDetails getPatientDetails() {
		return patientDetails;
	}
	public void setPatientDetails(PatientDetails patientDetails) {
		this.patientDetails = patientDetails;
	}
	public String getPatFName() {
		return patFName;
	}
	public void setPatFName(String patFName) {
		this.patFName = patFName;
	}
	public String getStfFName() {
		return stfFName;
	}
	public void setStfFName(String stfFName) {
		this.stfFName = stfFName;
	}
	public StaffDetails getStaffDetails() {
		return staffDetails;
	}
	public void setStaffDetails(StaffDetails staffDetails) {
		this.staffDetails = staffDetails;
	}
	public Date getTestDate() {
		return testDate;
	}
	public void setTestDate(Date testDate) {
		this.testDate = testDate;
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
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	

}
