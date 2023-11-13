package com.demo.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class TestReport {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int repNo;
	private int patId;
	@ManyToOne
    @JoinColumn(name = "patId",insertable=false,updatable=false)
    private PatientDetails patientDetails;
	private String testName;
	@ManyToOne
    @JoinColumn(name = "testName",insertable=false,updatable=false)
    private TestDetails testDetails;
	private Date testDate;
	private String normal;
	private String current;
	public TestReport() {
		super();
	}
	
	
	public TestReport(int repNo, int patId, PatientDetails patientDetails, String testName, TestDetails testDetails,
			Date testDate, String normal, String current) {
		super();
		this.repNo = repNo;
		this.patId = patId;
		this.patientDetails = patientDetails;
		this.testName = testName;
		this.testDetails = testDetails;
		this.testDate = testDate;
		this.normal = normal;
		this.current = current;
	}


	public int getRepNo() {
		return repNo;
	}
	public void setRepNo(int repNo) {
		this.repNo = repNo;
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
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	public TestDetails getTestDetails() {
		return testDetails;
	}
	public void setTestDetails(TestDetails testDetails) {
		this.testDetails = testDetails;
	}
	public Date getTestDate() {
		return testDate;
	}
	public void setTestDate(Date testDate) {
		this.testDate = testDate;
	}
	public String getNormal() {
		return normal;
	}
	public void setNormal(String normal) {
		this.normal = normal;
	}
	public String getCurrent() {
		return current;
	}
	public void setCurrent(String current) {
		this.current = current;
	}
	
	

}
