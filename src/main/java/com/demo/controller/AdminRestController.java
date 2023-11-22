package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.MVMStaff;
import com.demo.entity.StaffDetails;
import com.demo.entity.UserDetails;
import com.demo.service.AdminService;
import com.demo.service.IUserDetailsService;

//import com.demo.dao.EmployeeDao;


@CrossOrigin
@RestController
@RequestMapping("/api")
public class AdminRestController {

	private AdminService adminService;
    private IUserDetailsService userdetails;
    
	@Autowired
	public AdminRestController(AdminService adminService, IUserDetailsService userdetails) {
		super();
		this.adminService = adminService;
		this.userdetails = userdetails;
	}
	
	@GetMapping("/admins")
	public List<StaffDetails>findAll(){
		return adminService.findAll();
		}
	
	

	@GetMapping("/admins/{staffId}")
	public StaffDetails getStaff(@PathVariable int staffId){
		StaffDetails theAdmin=adminService.findById(staffId);
        if(theAdmin==null) {
        	throw new RuntimeException("staff id not found-"+staffId);
        }
        return theAdmin;	
}
	
	@PostMapping("/admins")
	public MVMStaff addStaff(@RequestBody MVMStaff theAdmin){
//		theAdmin.set
		adminService.save(theAdmin);
		return theAdmin;
		
	}
	
	@PutMapping("/admins/{staffId}")
	public StaffDetails updateStaff(@PathVariable int staffId, @RequestBody StaffDetails theAdmin) {
		StaffDetails adm = adminService.findById(staffId);
		if (theAdmin == null) {
			throw new RuntimeException("Staff id not found-" + staffId);
		}

		adm.setStfFName(theAdmin.getStfFName());
		adm.setStfGnd(theAdmin.getStfGnd());
		adm.setStfDob(theAdmin.getStfDob());
		adm.setStfMob(theAdmin.getStfMob());
		adm.setStfAdd(theAdmin.getStfAdd());
		adm.setStfDept(theAdmin.getStfDept());
		adm.setStfSpec(theAdmin.getStfSpec());
		adm.setStfQualif(theAdmin.getStfQualif());
		adm.setStfJod(theAdmin.getStfJod());
		adm.setStfSal(theAdmin.getStfSal());
		adm.setStfBldGrp(theAdmin.getStfBldGrp());
		adm.setStfEmail(theAdmin.getStfEmail());																																																			
		adminService.save(adm);
		return adm;
	}
	
	@DeleteMapping("/admins/{staffId}")
	public String deleteStaff(@PathVariable int staffId){
		StaffDetails theAdmin=adminService.findById(staffId);
        if(theAdmin==null) {
        	throw new RuntimeException("Staff id not found-"+staffId);
        }
        adminService.deleteById(staffId);
        return "Deleted StaffId: "+staffId;	 
	
}
	@GetMapping("/users/{stfId}/{userPass}")
	public ResponseEntity<UserDetails>
	findUserByNameAndPasswprd(@PathVariable int stfId,@PathVariable String userPass){
		UserDetails user=userdetails.findUserByUserIdAndPassword(stfId, userPass);
		return ResponseEntity.status(200).body(user);
		
	}
	@GetMapping("/users")
	public String findUser(int stfId){
		return adminService.findSTaffByIdAndName(stfId);
		}
	
	
	
}
