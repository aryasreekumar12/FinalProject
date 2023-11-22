package com.demo.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.demo.entity.StaffDetails;


public interface AdminRepository extends JpaRepository<StaffDetails, Integer> {
	  @Query("SELECT stf.stfDept FROM StaffDetails stf WHERE stf.stfId = ?1")
	    public String findStaffByIdAndName(int stfId);

}