package com.demo.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.demo.entity.StaffDetails;
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


	@Override
	public UserDetails findById(int theId) {
		Optional<UserDetails>result=login.findById(theId);
		UserDetails theUser=null;
		if(result.isPresent()) {
			theUser=result.get();
		}
		else {
			throw new RuntimeException("Did not find user Id "+theId);
		}
		return theUser;
	}

}
