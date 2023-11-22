package com.demo.entity;

public class UpdateClass {
	private StaffDetails stfDet;
	private UserDetails usd;
	public UpdateClass() {
		super();
	}
	public UpdateClass(StaffDetails stfDet, UserDetails usd) {
		super();
		this.stfDet = stfDet;
		this.usd = usd;
	}
	public StaffDetails getStfDet() {
		return stfDet;
	}
	public void setStfDet(StaffDetails stfDet) {
		this.stfDet = stfDet;
	}
	public UserDetails getUsd() {
		return usd;
	}
	public void setUsd(UserDetails usd) {
		this.usd = usd;
	}
	

}
