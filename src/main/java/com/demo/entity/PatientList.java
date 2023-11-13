package com.demo.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class PatientList {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int appNbr;
	private int patId;
	 @ManyToOne
	    @JoinColumn(name = "patId",insertable=false,updatable=false)
	    private PatientDetails patientDetails;
	private int stfId;
	 @ManyToOne
	    @JoinColumn(name = "stfId",insertable=false,updatable=false)
	private StaffDetails staffDetails;
	private Date appDate;
	public PatientList() {
		super();
	}
	public PatientList(int appNbr, int patId, PatientDetails patientDetails, int stfId, StaffDetails staffDetails,
			Date appDate) {
		super();
		this.appNbr = appNbr;
		this.patId = patId;
		this.patientDetails = patientDetails;
		this.stfId = stfId;
		this.staffDetails = staffDetails;
		this.appDate = appDate;
	}
	public int getAppNbr() {
		return appNbr;
	}
	public void setAppNbr(int appNbr) {
		this.appNbr = appNbr;
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
	public int getStfId() {
		return stfId;
	}
	public void setStfId(int stfId) {
		this.stfId = stfId;
	}
	public StaffDetails getStaffDetails() {
		return staffDetails;
	}
	public void setStaffDetails(StaffDetails staffDetails) {
		this.staffDetails = staffDetails;
	}
	public Date getAppDate() {
		return appDate;
	}
	public void setAppDate(Date appDate) {
		this.appDate = appDate;
	};


}
