package com.demo.service;

import com.demo.entity.StaffDetails;
import com.demo.entity.UserDetails;

public interface IUserDetailsService {
	public abstract UserDetails findUserByUserIdAndPassword(int stfId,String userPass);
	public abstract UserDetails findById(int stfId);

}
