package com.demo.entity;

import java.util.Date;

public class MVMStaff {
//	private int staffId;
	 private String stfFName;
	 private String stfGnd;
	 private Date stfDob;
	 private Long stfMob;
	 private String stfAdd;
	 private String stfDept;
	 private String stfSpec;
	 private String stfQualif;
	 private Date stfJod;
	 private int stfSal;
	 private String stfBldGrp;
	 private String stfEmail;
	private int userId;
	 private String userPassword;
	public MVMStaff() {
		super();
	}
	public MVMStaff(String stfFName, String stfGnd, Date stfDob, Long stfMob, String stfAdd,
			String stfDept, String stfSpec, String stfQualif, int stfSal, String stfBldGrp, String stfEmail, int userId,
			String userPassword) {
		super();
//		this.staffId = staffId;
		this.stfFName = stfFName;
		this.stfGnd = stfGnd;
		this.stfDob = stfDob;
		this.stfMob = stfMob;
		this.stfAdd = stfAdd;
		this.stfDept = stfDept;
		this.stfSpec = stfSpec;
		this.stfQualif = stfQualif;
		this.stfSal = stfSal;
		this.stfBldGrp = stfBldGrp;
		this.stfEmail = stfEmail;
		this.userId = userId;
		this.userPassword = userPassword;
	}
//	public int getStaffId() {
//		return staffId;
//	}
//	public void setStaffId(int staffId) {
//		this.staffId = staffId;
//	}
	public String getStfFName() {
		return stfFName;
	}
	public void setStfFName(String stfFName) {
		this.stfFName = stfFName;
	}
	public String getStfGnd() {
		return stfGnd;
	}
	public void setStfGnd(String stfGnd) {
		this.stfGnd = stfGnd;
	}
	public Date getStfDob() {
		return stfDob;
	}
	public void setStfDob(Date stfDob) {
		this.stfDob = stfDob;
	}
	public Long getStfMob() {
		return stfMob;
	}
	public void setStfMob(Long stfMob) {
		this.stfMob = stfMob;
	}
	public String getStfAdd() {
		return stfAdd;
	}
	public void setStfAdd(String stfAdd) {
		this.stfAdd = stfAdd;
	}
	public String getStfDept() {
		return stfDept;
	}
	public void setStfDept(String stfDept) {
		this.stfDept = stfDept;
	}
	public String getStfSpec() {
		return stfSpec;
	}
	public void setStfSpec(String stfSpec) {
		this.stfSpec = stfSpec;
	}
	public String getStfQualif() {
		return stfQualif;
	}
	public void setStfQualif(String stfQualif) {
		this.stfQualif = stfQualif;
	}
	public int getStfSal() {
		return stfSal;
	}
	public void setStfSal(int stfSal) {
		this.stfSal = stfSal;
	}
	public String getStfBldGrp() {
		return stfBldGrp;
	}
	public void setStfBldGrp(String stfBldGrp) {
		this.stfBldGrp = stfBldGrp;
	}
	public String getStfEmail() {
		return stfEmail;
	}
	public void setStfEmail(String stfEmail) {
		this.stfEmail = stfEmail;
	}
	public Date getStfJod() {
		return stfJod;
	}
	public void setStfJod(Date stfJod) {
		this.stfJod = stfJod;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	 

}
