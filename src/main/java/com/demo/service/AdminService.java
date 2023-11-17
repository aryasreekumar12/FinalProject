package com.demo.service;

import java.util.List;

import com.demo.entity.MVMStaff;
import com.demo.entity.StaffDetails;


public interface AdminService {
	
	public abstract List<StaffDetails>findAll();
	public abstract StaffDetails findById(int theId);
	public abstract void save(MVMStaff theAdmin);
	public abstract void save(StaffDetails theAdmin);
	public abstract void deleteById(int theId);

}