package com.demo.service;

import com.demo.entity.UserDetails;

public interface IUserDetailsService {
	public abstract UserDetails findUserByUserIdAndPassword(int stfId,String userPass);


}
