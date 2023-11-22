package com.demo.service;

import org.springframework.stereotype.Service;

import com.demo.entity.UserDetails;
import com.demo.repository.LoginRepo;

@Service
public class UserService implements IUserDetailsService{
	private LoginRepo login;
	

	public UserService(LoginRepo login) {
		super();
		this.login = login;
	}


	@Override
	public UserDetails findUserByUserIdAndPassword(int stfId, String userPass) {
		UserDetails user=login.findUserByNameAndPassword(stfId, userPass);
		if(user==null) {
			return null;
		}
		return user;
	}

}
