package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.StaffDetails;


public interface AdminRepository extends JpaRepository<StaffDetails, Integer> {

}