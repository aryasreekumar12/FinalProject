package com.demo.service;

import java.util.ArrayList;
import java.util.List; 
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.entity.MVMStaff;
import com.demo.entity.PatientDetails;
import com.demo.entity.StaffDetails;
import com.demo.entity.UserDetails;
import com.demo.repository.AdminRepository;
import com.demo.repository.LoginRepo;



@Service
public class AdminServiceImpl implements AdminService{
	

	private AdminRepository adminRepository;
	private LoginRepo loginRepo;
	
	



	public AdminServiceImpl(AdminRepository adminRepository, LoginRepo loginRepo) {
		super();
		this.adminRepository = adminRepository;
		this.loginRepo = loginRepo;
	}



	@Override
	
	public List<StaffDetails> findAll() {
		
		return adminRepository.findAll()
;	}

	

	@Override
	
	public StaffDetails findById(int theId) {
		Optional<StaffDetails>result=adminRepository.findById(theId);
		StaffDetails theAdmin=null;
		if(result.isPresent()) {
			theAdmin=result.get();
		}
		else {
			throw new RuntimeException("Did not find employee Id "+theId);
		}
		return theAdmin;
	}

	@Override
	public void save(MVMStaff theAdmin) {
		//create object of staff details -- stfdet
		StaffDetails stfdet= new  StaffDetails();
		stfdet.setStfFName(theAdmin.getStfFName());
		stfdet.setStfGnd(theAdmin.getStfGnd());
		stfdet.setStfDob(theAdmin.getStfDob());
		stfdet.setStfMob(theAdmin.getStfMob());
		stfdet.setStfAdd(theAdmin.getStfAdd());
		stfdet.setStfDept(theAdmin.getStfDept());
		stfdet.setStfSpec(theAdmin.getStfSpec());
		stfdet.setStfQualif(theAdmin.getStfQualif());
		stfdet.setStfJod(theAdmin.getStfJod());
		stfdet.setStfSal(theAdmin.getStfSal());
		stfdet.setStfBldGrp(theAdmin.getStfBldGrp());
		stfdet.setStfEmail(theAdmin.getStfEmail());
		adminRepository.save(stfdet);
		
		UserDetails usrDet=new UserDetails();
		usrDet.setStfId(stfdet.getstfId());
		usrDet.setUserPass(theAdmin.getUserPassword());
		loginRepo.save(usrDet);
		
	}

	@Override
	
	public void deleteById(int theId) {
		adminRepository.deleteById(theId);
		
	}



	@Override
	public void saveStaff(StaffDetails theAdmin) {
		adminRepository.save(theAdmin);
		
	}



	@Override
	public String findSTaffByIdAndName(int stfId) {
		// TODO Auto-generated method stub
		return adminRepository.findStaffByIdAndName(stfId);
	}



	@Override
	public void saveUser(UserDetails theUser) {
		// TODO Auto-generated method stub
		
	}


}
