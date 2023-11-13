package com.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class UserDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userId;
	private int stfId;
	@ManyToOne
    @JoinColumn(name = "stfId",insertable=false,updatable=false)
private StaffDetails staffDetails;
	private String userPass;
	public UserDetails() {
		super();
	}
	public UserDetails(int userId, int stfId, StaffDetails staffDetails, String userPass) {
		super();
		this.userId = userId;
		this.stfId = stfId;
		this.staffDetails = staffDetails;
		this.userPass = userPass;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
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
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	
	
}
