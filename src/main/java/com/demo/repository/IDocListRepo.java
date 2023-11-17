package com.demo.repository;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.demo.entity.PatientList;
import com.demo.entity.TestList;


public interface IDocListRepo extends JpaRepository<TestList, Integer> {

    @Query("SELECT pat FROM PatientList pat WHERE pat.stfId = ?1 AND pat.appDate = ?2")
    public PatientList findPatientByIdAndName(int stfId, LocalDate appDate);
}