package com.demo.repository;

import java.sql.Date;
//import java.time.LocalDate;
//import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.demo.entity.PatientList;
//import com.demo.entity.TestList;


public interface IDocListRepo extends JpaRepository<PatientList, Integer> {
    @Query("SELECT pat.patId FROM PatientList pat WHERE pat.stfId = ?1 AND pat.appDate = ?2")
    public List<Integer> findPatientByIdAndName(int stfId, Date appDate);
}