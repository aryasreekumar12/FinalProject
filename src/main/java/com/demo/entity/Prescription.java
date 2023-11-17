package com.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Prescription {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int prescId;
	private int patId;
	 @ManyToOne
	    @JoinColumn(name = "patId",insertable=false,updatable=false)
	    private PatientDetails patientDetails;
	private int stfId;
	 @ManyToOne
	    @JoinColumn(name = "stfId",insertable=false,updatable=false)
	private StaffDetails staffDetails;
	private String presc;
	private String medi;
	public Prescription() {
		super();
	}
	public Prescription(int prescId, int patId, int stfId, String presc, String medi) {
		super();
		this.prescId = prescId;
		this.patId = patId;
		this.stfId = stfId;
		this.presc = presc;
		this.medi = medi;
	}
	public int getPrescId() {
		return prescId;
	}
	public void setPrescId(int prescId) {
		this.prescId = prescId;
	}
	public int getPatId() {
		return patId;
	}
	public void setPatId(int patId) {
		this.patId = patId;
	}
	public int getStfName() {
		return stfId;
	}
	public void setStfName(int stfId) {
		this.stfId = stfId;
	}
	public String getPresc() {
		return presc;
	}
	public void setPresc(String presc) {
		this.presc = presc;
	}
	public String getMedi() {
		return medi;
	}
	public void setMedi(String medi) {
		this.medi = medi;
	}
	
	
	

}
