package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.demo.entity.UserDetails;

public interface LoginRepo extends JpaRepository<UserDetails, Integer>{
	@Query("from UserDetails where stfId=?1 and userPass=?2")
	public UserDetails findUserByNameAndPassword(int stfId,String userPass);
	

}
